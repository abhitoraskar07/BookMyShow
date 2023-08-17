package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.User;
import java.lang.String;

import java.util.Optional;

public interface UserDaoIf extends JpaRepository<User, Long> {
   
	Optional <User> findByEmailAndPassword(String email,String password);
	
}
