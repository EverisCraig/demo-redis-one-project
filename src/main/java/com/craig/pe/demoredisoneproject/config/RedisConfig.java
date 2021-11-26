package com.craig.pe.demoredisoneproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

@Configuration
public class RedisConfig {
    @Bean
    public LettuceConnectionFactory redLettuceConnectionFactory(){
        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("localhost",6379));
    }
}
