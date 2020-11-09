package com.test.spc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.spc.domain.User;
import com.test.spc.repo.UserRepo;



@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepo repo;

	public List<User> getUser() {
		return repo.findAll();
	}

}
