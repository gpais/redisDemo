package com.org.LetsGetDigital;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import com.org.LetsGetDigital.model.Cacheable;

import redis.clients.jedis.JedisPoolConfig;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableConfigurationProperties
@ConfigurationProperties(prefix="redis")
public class RedisConfig {

    private String hostName;
    private int port;

    
	@Bean
	public RedisConnectionFactory jedisConnectionFactory() {
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxTotal(5);
		poolConfig.setTestOnBorrow(true);
		poolConfig.setTestOnReturn(true);
		JedisConnectionFactory ob = new JedisConnectionFactory(poolConfig);
		ob.setUsePool(true);
		ob.setHostName(hostName);
		ob.setPort(port);
		return ob;
	}
	
	

	@Bean
	public RedisTemplate<String, Cacheable> getRedisTemplate(){
		RedisTemplate<String, Cacheable> template = new RedisTemplate<String, Cacheable>();
		template.setConnectionFactory(jedisConnectionFactory());
		return template;
	}
	@Bean
	public StringRedisTemplate stringRedisTemplate(){
		return new StringRedisTemplate(jedisConnectionFactory());
	}



	public String getHostName() {
		return hostName;
	}



	public void setHostName(String hostName) {
		this.hostName = hostName;
	}



	public int getPort() {
		return port;
	}



	public void setPort(int port) {
		this.port = port;
	}
}
