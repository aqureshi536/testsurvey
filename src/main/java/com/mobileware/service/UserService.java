package com.mobileware.service;

import org.springframework.stereotype.Service;

import com.mobileware.beans.request.LoginRequest;
import com.mobileware.beans.request.UserRegisterRequest;
import com.mobileware.beans.response.Response;

@Service
public class UserService {

	public Response login(LoginRequest loginRequest) {

		Response response = new Response();
		response.setStatusCode("00");
		response.setMessage("success");
		return response;

	}

	public Response register(UserRegisterRequest userRegisterRequest) {

		Response response = new Response();
		response.setStatusCode("00");
		response.setMessage("success");
		return response;

	}

}
