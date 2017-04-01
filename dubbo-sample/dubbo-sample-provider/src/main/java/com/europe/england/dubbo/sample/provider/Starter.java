package com.europe.england.dubbo.sample.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.dubbo.container.Main;

@SpringBootApplication(scanBasePackages="com.europe.england.dubbo")
@ImportResource("classpath:dubbo.xml")
@PropertySource("classpath:application.properties")
public class Starter {
	
	public static void main(String args[]){
		SpringApplication.run(Starter.class, args);
		Main.main(args);
	}

}
