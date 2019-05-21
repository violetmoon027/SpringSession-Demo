package com.test.service.a.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;
import redis.clients.jedis.Jedis;

@Configuration
@PropertySource("classpath:redis.properties")
public class MyConfiguration {

    @Value("${server.port}")
    public Integer port;

    @Value("${redis.url}")
    private String redisUrl;

    @Value("${redis.port}")
    private Integer redisPort;

    @Value("${redis.auth}")
    private String redisAuth;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Jedis getJedis() {
        System.out.println(redisUrl + " " + redisPort + " " + redisAuth);
        Jedis jedis = new Jedis(redisUrl, redisPort);
        return jedis;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
