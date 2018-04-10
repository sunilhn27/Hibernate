package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Deleting {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		try {

			Session session = factory.getCurrentSession();
			session.beginTransaction();

			int id = 6;

			Student mystudent = session.get(Student.class, id);

			System.out.println("DELETING 8888888888888888888888888888888888888888");
			session.delete(mystudent);
			System.out.println("susscully deleted " + mystudent.getId());

			session.getTransaction().commit();

		} finally {
			factory.close();
		}

	}
}
