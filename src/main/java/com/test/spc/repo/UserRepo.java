package com.test.spc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.spc.domain.User;
import org.springframework.stereotype.Repository;


public interface UserRepo extends JpaRepository<User, Integer> {

}
