package com.lazy.house.web.controller;

import com.lazy.house.biz.service.UserService;
import com.lazy.house.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LaZY(李志一)
 * @create 2019-06-05 22:06
 */
@RestController
public class UserController {
    @Autowired
    public UserService userService;
    @RequestMapping("user")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
