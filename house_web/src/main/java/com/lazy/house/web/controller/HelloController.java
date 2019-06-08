package com.lazy.house.web.controller;

import com.lazy.house.biz.service.UserService;
import com.lazy.house.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author LaZY(李志一)
 * @create 2019-06-07 22:16
 */
@Controller
public class HelloController {
    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    public String  hello(ModelMap modelMap){
        List<User> users = userService.getUsers();
        User one = users.get(0);
        modelMap.put("user", one);
        return "hello";
    }
    @RequestMapping("index")
    public String index(){
        return "homepage/index";
    }

    @RequestMapping("helloerror")
    public String helloError(ModelMap modelMap){
        if(true){
            throw new IllegalArgumentException();
        }
        return "hello";
    }
}
