package com;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.dao"})
public class SpringStarter {

	/**
	 * spring启动类
	 */
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringStarter.class, args);
	}

}
