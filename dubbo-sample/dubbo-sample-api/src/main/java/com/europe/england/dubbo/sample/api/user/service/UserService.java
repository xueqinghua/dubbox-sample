package com.europe.england.dubbo.sample.api.user.service;

import com.europe.england.dubbo.sample.api.user.entity.User;

public interface UserService {
	
	public void save(User user);
	
	public User get(String id);
	

}
