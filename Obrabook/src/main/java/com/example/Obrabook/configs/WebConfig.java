package com.example.Obrabook.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{

    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
        .allowedOrigins("http://localhost:3000", "http://10.0.0.102:3000/")
        .allowedMethods("GET", "CONNECT");
    }
    
}
