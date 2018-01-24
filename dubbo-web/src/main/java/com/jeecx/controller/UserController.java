package com.jeecx.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jeecx.bean.User;
import com.jeecx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ===========================
 * Created with IntelliJ IDEA.
 * User：yanghl
 * Date：2018/1/21
 * Time：18:37
 * ===========================
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/info/{id}")
    public User info(@PathVariable("id")Integer id){
        User user = userService.getUserById(id);
        return user;
    }

    @RequestMapping("/register")
    public void register(User user){

        userService.register(user);

    }

}
