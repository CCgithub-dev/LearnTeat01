package com.example.learnteat01.config;


import com.example.learnteat01.Override.ConditionOnClass;
import com.example.learnteat01.damian.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.Jedis;

@Configuration
public class Userconfig {

    @Bean
    @ConditionOnClass("redis.clients.jedis.Jedis")
    public User user() {
        return new User();
    }

}
