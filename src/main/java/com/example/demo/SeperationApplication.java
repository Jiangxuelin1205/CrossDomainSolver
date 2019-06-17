package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SeperationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeperationApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean<CrossFilter> registerFilter() {
        FilterRegistrationBean<CrossFilter> bean = new FilterRegistrationBean<>();
        bean.addUrlPatterns("/*");
        bean.setFilter(new CrossFilter());

        return bean;
    }

}
