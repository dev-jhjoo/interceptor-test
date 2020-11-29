package com.jjh.dev.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HttpInterceptor interceptor = new HttpInterceptor();
        registry.addInterceptor(interceptor)
                .addPathPatterns("/**");

    }
}
