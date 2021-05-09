package com.prominent.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class SessionUtil {

	SessionFactory sessionFactory;
	//Session session;

	public SessionFactory getSessionFactory() {
		try {
			if (sessionFactory == null) {
				sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			}
			return sessionFactory;

		} catch (Throwable th) {
			throw new ExceptionInInitializerError(th);
		}

	}

	public Session getSession() {
		Session session;
		try {

			session = getSessionFactory().openSession();
			session.beginTransaction();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
		return session;
	}

}
