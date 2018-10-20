package com.mobileware.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ImportResource({ "classpath:hibernateConfig.xml" })
public class HibernateConfig {

	@Autowired
	private static SessionFactory sessionFactory;

	public static void setSessionFactory(SessionFactory sessionFactory) {
		HibernateConfig.sessionFactory = sessionFactory;
	}

	public static Session getSession() {
		try {
			return sessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void closeSession(Session session) {
		session.close();
	}

}
