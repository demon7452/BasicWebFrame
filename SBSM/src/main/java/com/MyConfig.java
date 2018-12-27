package com;

import com.interceptors.StaticDomainInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

// TODO: 18-12-27 need learn,此注解会导致静态资源加载失败， why?
//@EnableWebMvc


@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Resource
    private StaticDomainInterceptor staticDomainInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(staticDomainInterceptor).addPathPatterns("/**");
    }
}
