package com.example.learnconfig.config;

import com.example.learnconfig.Cust;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustDemo {

    @Bean
    public Cust cust() {
        return new Cust();
    }
}
