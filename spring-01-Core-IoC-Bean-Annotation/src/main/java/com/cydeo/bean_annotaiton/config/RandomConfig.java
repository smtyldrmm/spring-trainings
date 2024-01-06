package com.cydeo.bean_annotaiton.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class RandomConfig {
    @Bean
    public String myString(){
        return "Cydeo";
    }

    @Bean
    public Integer myInteger(){
        return 5;
    }
}
