package com.mobileware.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "survey_invite")
public class Invite {

	@Id
	@Column(name = "INVITE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int inviteId;
	@Column(name = "EMAIL_ID")
	private String emailId;

	@ManyToOne
	@JoinColumn(name = "INVITOR_ID")
	private User invitorId;

	@Column(name = "TOKEN")
	private String token;

	public int getInviteId() {
		return inviteId;
	}

	public void setInviteId(int inviteId) {
		this.inviteId = inviteId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public User getInvitorId() {
		return invitorId;
	}

	public void setInvitorId(User invitorId) {
		this.invitorId = invitorId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
