package com.example.learnteat01.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class redisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void Redisset() {
        redisTemplate.opsForValue().set("discos", "我怎么跑reids里了",100L);
    }
    @Test
    public void Redisget(){
        System.out.println(redisTemplate.opsForValue().get("discos"));
    }
}
