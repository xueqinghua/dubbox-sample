package com.europe.england.dubbo.sample.consumer.user.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.config.annotation.Reference;
import com.europe.england.dubbo.sample.api.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	@Reference
	private UserService userService;

	@Test
	public void test() {
		System.out.println(userService.get("id"));
	}

}
