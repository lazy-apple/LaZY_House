package com.lazy.house.biz.service;


import com.lazy.house.common.model.User;
import com.lazy.house.biz.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LaZY(李志一)
 * @create 2019-06-05 22:07
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.selectUsers();
    }

}
