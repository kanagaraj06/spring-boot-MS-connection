package com.test.spc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.spc.domain.User;


public interface UserRepo extends JpaRepository<User, Integer> {

}
