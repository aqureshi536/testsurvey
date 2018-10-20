package com.mobileware.service;

import org.springframework.stereotype.Service;

import com.mobileware.beans.Invite;
import com.mobileware.beans.request.UserInviteRequest;
import com.mobileware.beans.response.PreRegistrationResponse;
import com.mobileware.beans.response.Response;
import com.mobileware.common.Constants;
import com.mobileware.common.ErrorCode;
import com.mobileware.dao.InviteDAO;

@Service
public class InviteService {

	private InviteDAO inviteDAO;

	public void setInviteDAO(InviteDAO inviteDAO) {
		this.inviteDAO = inviteDAO;
	}

	public PreRegistrationResponse checkForToken(String token) {
		PreRegistrationResponse preRegistrationResponse = new PreRegistrationResponse();
		Invite invite = inviteDAO.getEmailBasedOnToken(token);
		String errorCode = "";
		String statusCode = "";
		String message = "";
		if (invite != null) {
			preRegistrationResponse.setEmail(invite.getEmailId());
			statusCode = Constants.GENERIC_SUCCESS;
		} else {
			statusCode = Constants.GENERIC_FAILURE;
			errorCode = ErrorCode.INVALID_INVITE_TOKEN;
		}
		preRegistrationResponse.setErrorCode(errorCode);
		preRegistrationResponse.setStatusCode(statusCode);
		preRegistrationResponse.setMessage(message);

		return preRegistrationResponse;
	}

	public Response sendInvite(UserInviteRequest userInviteRequest) {
		Response response = new Response();
		inviteDAO.saveInvite(invite);
		return response;
	}
	
	
	
	
	
}
