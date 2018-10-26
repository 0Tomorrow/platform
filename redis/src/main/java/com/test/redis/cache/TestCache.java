package com.test.redis.cache;

import com.test.redis.bo.UserInfo;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class TestCache {

  @CachePut(value = "test",
      key = "#userInfo.userName.toString()", condition = "#userInfo.userName != null")
  public String put(UserInfo userInfo){
    return userInfo.getPassword();
  }

  @CachePut(value = "test",
      key = "#key.toString()", condition = "#key != null")
  public String put2(String key){
    return key;
  }

  @Cacheable(value = "test",
      key = "#key.toString()", condition = "#key != null")
  public String get(String key) {
    return null;
  }

  @CacheEvict(value = "test", key = "#key.toString()", condition = "#key != null")
  public void delete(String key) {}
}
