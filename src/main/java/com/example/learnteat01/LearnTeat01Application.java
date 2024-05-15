package com.example.learnteat01;

import com.example.learnconfig.config.CustDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * 用@ComponentScan,扫描包名可以获取
 * 用@Import,注入类名,可以获取
 *
 *
 */


@SpringBootApplication
//@ComponentScan("com.example.learnconfig.config")
@Import(CustDemo.class)
public class LearnTeat01Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(LearnTeat01Application.class, args);

        Object redisTemplate = context.getBean("cust");
        System.out.println(redisTemplate);
    }

}
