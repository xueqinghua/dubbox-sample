package com.europe.england.dubbo.sample.consumer.user.facade;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.europe.england.dubbo.sample.api.user.entity.User;
import com.europe.england.dubbo.sample.api.user.service.UserService;

@Service
public class UserFacade {
	
	@Reference
	private UserService userService;
	
	public User get(String id){
		return userService.get(id);
	}

}
