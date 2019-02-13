package com.xiong.web.controller;

import com.xiong.api.UserApi;
import com.xiong.dao.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserApi userApi;

    @GetMapping("add")
    @ResponseBody
    public String addUser(){
        User user = new User();
        user.setName("user_" + System.currentTimeMillis());
        userApi.addUser(user);
        return "success";
    }

    @GetMapping("all")
    @ResponseBody
    public List<User> getAllUser(){

        return userApi.findALL();
    }
}
