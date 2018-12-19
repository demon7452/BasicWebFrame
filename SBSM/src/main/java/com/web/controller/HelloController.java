package com.web.controller;

import com.utils.PageUrlUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public ModelAndView showHelloPage(@PathVariable("name")String name){

        ModelAndView modelAndView = new ModelAndView(PageUrlUtil.HELLO_PAGE_URL);

        modelAndView.addObject("name" ,name);

        return modelAndView;
    }
}
