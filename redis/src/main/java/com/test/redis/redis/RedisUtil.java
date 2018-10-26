package com.test.redis.redis;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {

  @Autowired
  RedisTemplate<String, Object> redisTemplate;

  public void set(String cacheName, String key, String value) {
    String setKey = cacheName + ":" + key;
    redisTemplate.execute((RedisCallback<Boolean>) connection -> {
      RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
      connection.set(serializer.serialize(setKey), serializer.serialize(value));
      return true;
    });
  }

  public String get(String cacheName, String key) {
    String getKey = cacheName + ":" + key;
    return redisTemplate.execute((RedisCallback<String>) connection -> {
      RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
      byte[] value =  connection.get(serializer.serialize(getKey));
      return serializer.deserialize(value);
    });
  }

  public Set<String> getKeys(String keys) {
    return redisTemplate.keys(keys);
  }
}
