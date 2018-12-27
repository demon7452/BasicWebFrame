package com.interceptors;

import com.utils.WebUrlProperty;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class StaticDomainInterceptor implements HandlerInterceptor {

    @Resource
    private WebUrlProperty webUrlProperty;

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        if(null != modelAndView){
            modelAndView.addObject("staticDomainUrl", webUrlProperty.getWebDomain());
        }
    }
}
