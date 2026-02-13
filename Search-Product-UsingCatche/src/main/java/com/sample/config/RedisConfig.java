package com.sample.config;

import java.time.Duration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

@Configuration
@EnableCaching
public class RedisConfig {
     @Bean
	public RedisCacheManager cacheManager(LettuceConnectionFactory redisConnectionFactory) {
		
		RedisCacheConfiguration cacheConfiguration= RedisCacheConfiguration.defaultCacheConfig()
				.entryTtl(Duration.ofMinutes(1))
				.disableCachingNullValues();
		
		return RedisCacheManager.builder(redisConnectionFactory)
				.cacheDefaults(cacheConfiguration)
				.build();
	}
	
}
