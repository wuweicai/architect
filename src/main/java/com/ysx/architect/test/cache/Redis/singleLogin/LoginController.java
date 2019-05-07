package com.ysx.architect.test.cache.Redis.singleLogin;

import com.ysx.architect.test.exception.SelfException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/api/user")
public class LoginController
{
    @Autowired
    private UserService userService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("/login")
    public ReturnData login(HttpServletRequest request, String account, String password)
            throws Exception
    {
        User user = userService.findUserByAccountAndPassword(account, password);
        if (user != null)
        {
            HttpSession session = request.getSession();
            session.setAttribute("loginUserId", user.getId());
            redisTemplate.opsForValue().set("loginUser:" + user.getId(), session.getId());

            return new ReturnData(StatusCode.REQUEST_SUCCESS, user, "登录成功！");
        }
        else
        {
            throw new SelfException(StatusCode.ACCOUNT_OR_PASSWORD_ERROR, "账户名或密码错误！");
        }
    }

    @RequestMapping(value = "/getUserInfo")
    public ReturnData get(String userId)
            throws Exception
    {
        User user = userService.findUserById(userId);
        if (user != null)
        {
            return new ReturnData(StatusCode.REQUEST_SUCCESS, user, "查询成功！");
        }
        else
        {
            throw new SelfException(StatusCode.USER_NOT_EXIST, "用户不存在！");
        }
    }
}