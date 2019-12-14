package com.ysx.architect.test.hutool.datetime;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.*;
import cn.hutool.core.lang.Console;

import java.util.Calendar;
import java.util.Date;

/**
 * @ProjectName: architect
 * @Package: com.ysx.architect.test.hutool.datetime
 * @ClassName: DatetimeConvert
 * @Author: wuweicai
 * @Description:
 * @Date: 2019/12/11 13:41
 * @Version: 1.0
 */
public class DatetimeConvert {

    public static void main(String[] args) throws Exception {
        //当前时间
        Date date = DateUtil.date();
        System.out.println(Convert.toStr(date));
        //当前时间
        Date date2 = DateUtil.date(Calendar.getInstance());
        //当前时间
        Date date3 = DateUtil.date(System.currentTimeMillis());
        //当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
        String now = DateUtil.now();
        //当前日期字符串，格式：yyyy-MM-dd
        String today= DateUtil.today();

        String dateStr = "2017-03-01 23:12:45";
        Date date4 = DateUtil.parse(dateStr);
        System.out.println(Convert.toStr(date4));
        Date date5 = DateUtil.parse(dateStr, "yyyy-MM-dd");
        System.out.println(Convert.toStr(date5));

        //结果 2017/03/01
        String format = DateUtil.format(date4, "yyyy/MM/dd");
        System.out.println(format);

        //常用格式的格式化，结果：2017-03-01
        String formatDate = DateUtil.formatDate(date4);
        System.out.println(formatDate);

        //结果：2017-03-01 00:00:00
        String formatDateTime = DateUtil.formatDateTime(date4);
        System.out.println(formatDateTime);

        //年龄
        DateUtil.ageOfNow("1990-01-30");
        //是否闰年
        DateUtil.isLeapYear(2017);

        //结果：00:00:00
        String formatTime = DateUtil.formatTime(date4);
        System.out.println(formatTime);

        TimeInterval timer = DateUtil.timer();

        //---------------------------------
        //-------这是执行过程
        //---------------------------------

        timer.interval();//花费毫秒数
        timer.intervalRestart();//返回花费时间，并重置开始时间
        timer.intervalMinute();//花费分钟数

        //Level.MINUTE表示精确到分
        String formatBetween = DateUtil.formatBetween(100000000, BetweenFormater.Level.MINUTE);
        //输出：31天1小时
        Console.log(formatBetween);


        String dateStr1 = "2017-03-01 22:33:23";
        Date date11 = DateUtil.parse(dateStr1);

        String dateStr2 = "2017-04-01 23:33:23";
        Date date21 = DateUtil.parse(dateStr2);

        //相差一个月，31天
        long betweenDay = DateUtil.between(date11, date21, DateUnit.DAY);
        Console.log(betweenDay);

        //昨天
        DateUtil.yesterday();
        //明天
        DateUtil.tomorrow();
        //上周
        DateUtil.lastWeek();
        //下周
        DateUtil.nextWeek();
        //上个月
        DateUtil.lastMonth();
        //下个月
        DateUtil.nextMonth();

        String dateStr11 = "2017-03-01 22:33:23";
        Date date111 = DateUtil.parse(dateStr11);

        //结果：2017-03-03 22:33:23
        Date newDate = DateUtil.offset(date111, DateField.DAY_OF_MONTH, 2);

        //常用偏移，结果：2017-03-04 22:33:23
        DateTime newDate2 = DateUtil.offsetDay(date111, 3);

        //常用偏移，结果：2017-03-01 19:33:23
        DateTime newDate3 = DateUtil.offsetHour(date111, -3);

        Date date22 = DateUtil.date();
        //获得年的部分
        DateUtil.year(date22);
        //获得月份，从0开始计数
        DateUtil.month(date22);
        //获得月份枚举
        DateUtil.monthEnum(date22);
    }
}
