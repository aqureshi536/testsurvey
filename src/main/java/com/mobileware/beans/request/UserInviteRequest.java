package com.mobileware.beans.request;

import java.util.ArrayList;
import java.util.List;

public class UserInviteRequest {

	private List<String> listOfEmailId = new ArrayList<>();

	/**
	 * User Id of invitor to the invitee
	 */
	private String userId;
	private String inviteDate;

	public String getInviteDate() {
		return inviteDate;
	}

	public void setInviteDate(String inviteDate) {
		this.inviteDate = inviteDate;
	}

	public List<String> getListOfEmailId() {
		return listOfEmailId;
	}

	public void setListOfEmailId(List<String> listOfEmailId) {
		this.listOfEmailId = listOfEmailId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
