package com.example.learnteat01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class LearnTeat01Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(LearnTeat01Application.class, args);

        Object redisTemplate = run.getBean("user");
        System.out.println(redisTemplate);
    }

}
