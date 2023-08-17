package com.app.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDaoIf;
import com.app.dto.AuthenticateResponse;
import com.app.dto.SignInRequest;
import com.app.dto.SignUpRequest;
import com.app.pojo.User;

@Service
@Transactional
public class UserService implements UserServiceIf {
	
	@Autowired
	private UserDaoIf userDao;
	// autowire : model mapper
	@Autowired
	private ModelMapper mapper;

	@Override
	public AuthenticateResponse registerUser(SignUpRequest signUpUser) {
		// map dto --> entity
				User user = mapper.map(signUpUser, User.class);
				// invoke dao's method for saving emp dtls in DB
				User user2= userDao.save(user);
				// map entity --> dto
				return mapper.map(user2, AuthenticateResponse.class);
	}

	@Override
	public AuthenticateResponse signInUser(SignInRequest signInUser) {		
		Optional<User> user = userDao.findByEmailAndPassword(signInUser.getEmail(),signInUser.getPassword());
		System.out.println(user);
		//for mapping user we need to use get() at type of user is Optional
		return mapper.map(user.get() ,  AuthenticateResponse.class );
		
	}

	

	

}
