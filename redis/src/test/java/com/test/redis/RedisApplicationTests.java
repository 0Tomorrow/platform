package com.test.redis;

import com.test.redis.cache.TestCache;
import com.test.redis.redis.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisApplication.class)
@Slf4j
public class RedisApplicationTests {

	@Autowired
	TestCache testCache;

	@Autowired
	RedisUtil redisUtil;

	@Test
	public void contextLoads() {
//		testCache.delete("123");
//		testCache.delete("tlf");
//		testCache.delete("asdf#1584543739");
//		testCache.put2("asdf#1584543739");

//		redisUtil.set("test", "asdf#1584543739", "asdf#1584543739");
//		String result = redisUtil.get("test", "asdf#1584543739");
		String result = redisUtil.getKeys("*").toArray()[0].toString();
		log.info("{}", result);
	}

}
