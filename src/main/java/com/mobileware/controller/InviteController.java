package com.mobileware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobileware.beans.request.UserInviteRequest;
import com.mobileware.beans.response.PreRegistrationResponse;
import com.mobileware.beans.response.Response;
import com.mobileware.service.InviteService;

@RestController
@RequestMapping("/invite")
public class InviteController {

	@Autowired
	private InviteService inviteService;

	@PostMapping("/send")
	public Response sendInvite(UserInviteRequest userInviteRequest) {
		return null;
	}

	@GetMapping("/verify/{token}")
	public PreRegistrationResponse verifyPreRegistrationProcess(@PathVariable String token) {
		return inviteService.checkForToken(token);
	}

}
