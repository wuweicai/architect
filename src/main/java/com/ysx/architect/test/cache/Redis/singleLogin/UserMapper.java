package com.ysx.architect.test.cache.Redis.singleLogin;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    public User findUserByAccountAndPassword(@Param("account") String account,
                                            @Param("password") String password);

    public User findUserById(String Id);
}
