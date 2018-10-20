package com.mobileware.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.mobileware.app.HibernateConfig;
import com.mobileware.beans.Invite;
import com.mobileware.dao.InviteDAO;

public class InviteDAOImpl implements InviteDAO {

	@Override
	public Invite getEmailBasedOnToken(String token) {
		Session session = null;
		try {

			session = HibernateConfig.getSession();
			Query<Invite> query = session.createQuery("from Invite where token=:token");
			query.setString("token", token);
			session.beginTransaction();
			List<Invite> invites = query.getResultList();
			return invites.get(0);
		} finally {
			HibernateConfig.closeSession(session);
		}
	}

	@Override
	public Invite saveInvite(Invite invite) {
		Session session = null;
		try {
			session = HibernateConfig.getSession();
			session.beginTransaction();
			session.save(invite);
			session.getTransaction().commit();
		} finally {
			HibernateConfig.closeSession(session);
		}
		return null;
	}

}
