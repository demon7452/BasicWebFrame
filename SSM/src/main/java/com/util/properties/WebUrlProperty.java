package com.util.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("webUrlProperty")
@PropertySource(value = "classpath:properties/webUrl.properties")
public class WebUrlProperty {

    @Value("${domain}")
    private String domain;

    @Value("${project.name}")
    private String projectName;

    @Value("${hello.page}")
    private String helloPage;

    @Value("${users.page}")
    private String usersPage;

    @Value("${users.page.url}")
    private String usersPageUrl;

    public String getHelloPage() {
        return helloPage;
    }

    public String getUsersPage() {
        return usersPage;
    }

    public String getUsersPageUrl() {
        return usersPageUrl;
    }

    public String getStaticDomainUrl(){
        return String.format("%s/%s", domain, projectName);
    }

}
