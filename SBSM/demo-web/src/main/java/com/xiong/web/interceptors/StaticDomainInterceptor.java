package com.xiong.web.interceptors;

import com.xiong.util.constant.WebConstant;
import com.xiong.util.property.UrlProperty;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class StaticDomainInterceptor implements HandlerInterceptor {

    @Resource
    private UrlProperty urlProperty;

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        if(null != modelAndView){
            modelAndView.addObject(WebConstant.PARAM_STATIC_DOMAIN, urlProperty.getStaticDomain());
        }
    }
}
