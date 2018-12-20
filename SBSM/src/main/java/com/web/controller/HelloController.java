package com.web.controller;

import com.alibaba.fastjson.JSON;
import com.dao.entities.User;
import com.service.api.UserServiceApi;
import com.utils.PageUrlUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private UserServiceApi userServiceApi;

    @GetMapping("/hello/{name}")
    public ModelAndView showHelloPage(@PathVariable("name")String name){

        ModelAndView modelAndView = new ModelAndView(PageUrlUtil.HELLO_PAGE_URL);

        modelAndView.addObject("name" ,name);

        return modelAndView;
    }

    @GetMapping("/user/{userId}")
    @ResponseBody
    public String getUserByUserId(@PathVariable("userId") long userId){

        User user = userServiceApi.queryById(userId);

        return JSON.toJSONString(user);
    }
}
