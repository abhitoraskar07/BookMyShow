package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AuthenticateResponse;
import com.app.dto.SignInRequest;
import com.app.dto.SignUpRequest;
import com.app.pojo.User;
import com.app.service.UserService;
import com.app.service.UserServiceIf;

@RestController
@RequestMapping("/user")
public class UserController{
	
	@Autowired
	private UserServiceIf userService;
	
	@PostMapping("/signUp")
	public AuthenticateResponse addUser(@RequestBody @Valid SignUpRequest signUpUser) {
	   return userService.registerUser(signUpUser);	
	}
	
	@PostMapping("/signIn")
	public AuthenticateResponse signIn(@RequestBody @Valid SignInRequest signInUser) {
		return userService.signInUser(signInUser);
	}
}
