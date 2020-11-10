package com.test.spc.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.spc.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.spc.domain.User;
import com.test.spc.repo.UserRepo;



@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepo repo;



	public List<UserDto> getUser() {
		List<User> userList = repo.findAll();
		ObjectMapper mapper = new ObjectMapper();
		UserDto dto;
		List<UserDto> dtoList = new ArrayList<>();

		for (User usr: userList ) {
						dto = mapper.convertValue(usr,UserDto.class);
			dtoList.add(dto);
		}

		return dtoList;
	}

	public User addUser(UserDto dto) {
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.convertValue(dto,User.class);
		return repo.saveAndFlush(user);
	}
}
