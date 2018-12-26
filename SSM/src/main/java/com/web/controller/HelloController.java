package com.web.controller;

import com.service.api.UserApi;
import com.util.properties.WebUrlProperty;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class HelloController {

    @Resource
    private WebUrlProperty webUrlProperty;

    @Resource
    private UserApi userApi;

    @GetMapping("/hello/{name}")
    public ModelAndView hello(@PathVariable(value = "name",required = false) String name){
        ModelAndView modelAndView = new ModelAndView(webUrlProperty.getHelloPage());

        if(StringUtils.isEmpty(name)){
            name = "world";
        }

        modelAndView.addObject("name", name);
        modelAndView.addObject("userPageUrl", webUrlProperty.getUsersPageUrl());

        return modelAndView;
    }

    @GetMapping("/show/all/users")
    public ModelAndView showAllUsers(){
        ModelAndView modelAndView = new ModelAndView(webUrlProperty.getUsersPage());

        modelAndView.addObject("users", userApi.getAllUsers());

        return modelAndView;
    }
}
