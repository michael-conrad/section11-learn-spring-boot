package com.michael_conrad.springboot.learn_spring_boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrentServiceConfiguration {
    private String url;
    private String username;
    private String key;

    public CurrentServiceConfiguration(String url, String username, String key) {
        this.url = url;
        this.username = username;
        this.key = key;
    }

    public CurrentServiceConfiguration() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
