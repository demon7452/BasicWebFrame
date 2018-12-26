package com.interceptors;

import com.util.properties.WebUrlProperty;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StaticDomainInterceptor implements HandlerInterceptor {

    @Resource
    private WebUrlProperty webUrlProperty;

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           @Nullable ModelAndView modelAndView) throws Exception {
        if(null != modelAndView){
            modelAndView.addObject("staticDomainUrl", webUrlProperty.getStaticDomainUrl());
        }
    }
}
