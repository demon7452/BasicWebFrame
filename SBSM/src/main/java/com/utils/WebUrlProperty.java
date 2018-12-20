package com.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("webUrlProperty")
@PropertySource(value = "classpath:properties/webUrlProperty.properties")
public class WebUrlProperty {

    @Value("${web.domain.url}")
    private String webDomain;


    public String getWebDomain() {
        return webDomain;
    }
}
