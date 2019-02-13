package com.xiong.web.controller;

import com.xiong.util.constant.PageConstant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("home")
public class HomeController {

    @GetMapping
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView(PageConstant.HOME);
        return modelAndView;
    }

}
