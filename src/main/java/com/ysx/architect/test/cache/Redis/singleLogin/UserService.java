package com.ysx.architect.test.cache.Redis.singleLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserMapper userMapper;

    public User findUserByAccountAndPassword(String account, String password){
        User user = userMapper.findUserByAccountAndPassword(account,password);

        return user;
    }

    public User findUserById(String Id){
        User user = userMapper.findUserById(Id);
        return user;
    }
}
