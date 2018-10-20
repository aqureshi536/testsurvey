package com.mobileware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobileware.beans.request.LoginRequest;
import com.mobileware.beans.request.UserRegisterRequest;
import com.mobileware.beans.response.Response;
import com.mobileware.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public Response login(LoginRequest loginRequest) {
		return userService.login(loginRequest);
	}

	

	@PostMapping("/register/verified")
	public Response register(UserRegisterRequest userRegisterRequest) {
		return userService.register(userRegisterRequest);
	}


}
