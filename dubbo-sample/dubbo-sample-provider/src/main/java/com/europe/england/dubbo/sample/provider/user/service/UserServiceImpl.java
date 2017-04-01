package com.europe.england.dubbo.sample.provider.user.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.config.annotation.Service;
import com.europe.england.dubbo.sample.api.user.entity.User;
import com.europe.england.dubbo.sample.api.user.service.UserService;

@Service
@Path("user")
public class UserServiceImpl implements UserService{

	@Override
	@POST
	@Path("save")
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(User user) {
		System.out.println("save -----------------------------------");
		
	}

	@GET
	@Path("get")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public User get(String id) {
		
		System.out.println("get -----------------------------------");
		User user = new User();
		user.setId(id);
		user.setName("name_"+id);
		return user;
	}

}
