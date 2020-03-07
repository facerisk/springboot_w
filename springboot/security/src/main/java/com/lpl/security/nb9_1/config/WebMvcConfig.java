package com.lpl.security.nb9_1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebMvcConfig  extends WebMvcConfigurerAdapter {

//    @Autowired
//    AdminLoginInterceptor adminLoginInterceptor;
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(adminLoginInterceptor).addPathPatterns("/admin").excludePathPatterns("/login/**");
//        registry.addInterceptor(adminLoginInterceptor).addPathPatterns("/index");
//        //super.addInterceptors(registry);
//    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }
}
