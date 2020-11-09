package com.test.spc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.spc.domain.User;
import com.test.spc.service.UserService;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService service;
	
	@GetMapping(path="getUser")
	public String getUser()
	{
		List<User> userlist = service.getUser();
		log.info("user details {}",userlist);
		return "User retrived successfully";
	}

}
