package com.app.service;

import com.app.dto.AuthenticateResponse;
import com.app.dto.SignInRequest;
import com.app.dto.SignUpRequest;
import com.app.pojo.User;

public interface UserServiceIf {
   AuthenticateResponse registerUser(SignUpRequest signUpUser);
   AuthenticateResponse signInUser(SignInRequest signInUser);
}
