package com.ip.testredis;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RegistrationBean {
    @Autowired
    private RedisTemplate<String,BIConversion.User> redisTemplate;

    public RedisTemplate<String, BIConversion.User> getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate<String, BIConversion.User> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}