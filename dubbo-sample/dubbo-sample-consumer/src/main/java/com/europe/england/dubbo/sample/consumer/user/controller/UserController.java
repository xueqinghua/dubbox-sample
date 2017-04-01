package com.europe.england.dubbo.sample.consumer.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.europe.england.dubbo.sample.consumer.user.facade.UserFacade;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserFacade userFacade;
	
	@RequestMapping("get")
	@ResponseBody
	public Object get(@RequestParam(required=false) String id){
		return userFacade.get(id);
	}

}
