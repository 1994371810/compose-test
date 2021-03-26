package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author gjw
 * @Date 2021/3/25 11:36
 **/
@RestController
public class HelloController {
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/hello")
    public String hello(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        return "该页面已被访问: "+valueOperations.increment("key")+" 次";
    }
}
