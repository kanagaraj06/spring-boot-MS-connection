package com.test.spc.controller;

import java.awt.*;
import java.util.List;

import com.test.spc.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.test.spc.domain.User;
import com.test.spc.service.UserService;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService service;
	
	@GetMapping(path="getUser",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserDto> getUser()
	{
		List<UserDto> userlist = service.getUser();
		log.info("user details {}",userlist);
		return userlist;
	}

	@PostMapping(path = "/addUser",consumes = MediaType.APPLICATION_JSON_VALUE)
	public User addUser(@RequestBody UserDto dto){
		return service.addUser(dto);

	}



}
