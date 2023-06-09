package me.mvc.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
public class WebConfig {
    
    @Bean
    ViewResolver getViewResolver() {
        return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
    }
}
