package com.mobileware.dao;

import com.mobileware.beans.Invite;

public interface InviteDAO {

	public Invite getEmailBasedOnToken(String token);

	public Invite saveInvite(Invite invite);

}
