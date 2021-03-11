package com.pawanjindal.first.config;


import com.pawanjindal.first.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;

@Configuration
public class MyFilterConfig {
    @Bean
    public FilterRegistrationBean<MyFilter> registrationBean(){
        FilterRegistrationBean<MyFilter> registrationBean= new FilterRegistrationBean<>();
        registrationBean.setFilter((new MyFilter()));
        registrationBean.addUrlPatterns("/customers/*");

        return registrationBean;
    }
}
