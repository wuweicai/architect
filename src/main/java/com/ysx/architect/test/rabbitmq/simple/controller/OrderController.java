package com.ysx.architect.test.rabbitmq.simple.controller;

import com.google.gson.Gson;

import com.rabbitmq.client.Channel;
import com.ysx.architect.common.BeanTools;
import com.ysx.architect.test.rabbitmq.simple.bean.Order;
import com.ysx.architect.test.rabbitmq.simple.config.QueueConfig;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.UUID;

/**
 * @author zhuzhe
 * @date 2018/6/7 9:48
 * @email 1529949535@qq.com
 */
@Slf4j
@RequestMapping("/order")
@RestController
public class OrderController {
    private final static Logger LOG = LoggerFactory.getLogger(OrderController.class);


    /*@Autowired
    private RabbitTemplate rabbitTemplate;*/

    RabbitTemplate rabbitTemplate = (RabbitTemplate)BeanTools.getBean(RabbitTemplate.class);

    /**
     * 保存order , 同时需要向store服务发送通知减库存
     * @param order
     * @return
     */
    @PostMapping("/save")
    public Order saveOrder(Order order){
        order.setId((long)1);
        order.setPrice(0.1);
        order.setRemark("test");
        log.info(order.toString());
        Gson gson = new Gson();
        String json = gson.toJson(order);

        String msgId = UUID.randomUUID().toString();
        /**
         * 构建Message ,主要是使用 msgId 将 message 和 CorrelationData 关联起来。
         * 这样当消息发送到交换机失败的时候，在 MsgSendConfirmCallBack 中就可以根据
         * correlationData.getId()即 msgId,知道具体是哪个message发送失败,进而进行处理。
         */
        /*将 msgId和 message绑定*/
        Message message = MessageBuilder.withBody(json.getBytes())
                .setContentType(MessageProperties.CONTENT_TYPE_JSON)
                .setCorrelationId(msgId).build();
        /*将 msgId和 CorrelationData绑定*/
        CorrelationData correlationData = new CorrelationData(msgId);

        // TODO 将 msgId 与 Message 的关系保存起来
        /**
         * 将 msgId 与 Message 的关系保存起来,例如放到缓存中.
         * 当 MsgSendReturnCallback回调时（消息从交换机到队列失败）,进行处理 {@code MsgSendReturnCallback}.
         * 当 MsgSendConfirmCallBack回调时,进行处理 {@code MsgSendConfirmCallBack}.
         * 定时检查这个绑定关系列表,如果发现一些已经超时(自己设定的超时时间)未被处理,则手动处理这些消息.
         */
        /**
         * 发送消息
         * 指定消息交换机  "first_exchange"
         * 指定队列key    "queue_one_key1"
         */
        rabbitTemplate.convertAndSend("first_exchange", "queue_one_key1",
                message, correlationData);
        System.out.println("发送消息：correlationData--" + correlationData);
        return order;
    }

    @RabbitListener(queues = {QueueConfig.QUEUE_NAME1})
    public void consumerOrder(Message message, Channel channel) throws IOException {
        try {
            //channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            LOG.debug(message.getBody().toString());
            System.out.println(message.getBody().toString());
        }
        catch (Exception e1) {
            // 如果消息在重发的时候,出现了问题,可用nack,经过开发中的实际测试，当消息回滚到消息队列时，
            // 这条消息不会回到队列尾部，而是仍是在队列头部，这时消费者会立马又接收到这条消息，进行处理，接着抛出异常，
            // 进行回滚，如此反复进行。这种情况会导致消息队列处理出现阻塞，消息堆积，导致正常消息也无法运行
            // channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
            // 改为重新发送消息,经过多次重试后，如果重试次数大于3,就不会再走这，直接丢到了fail queue等待人工处理
            LOG.error("消息发送到重试队列的时候，异常了:" + e1.getMessage() + ",重新发送消息");
        }
    }
}
