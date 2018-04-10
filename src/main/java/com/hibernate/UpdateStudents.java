package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudents {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			int Id = 1;

			Student mystudent = session.get(Student.class, Id);
			mystudent.setFirstname("Meredith");
			System.out.println("DONE +++++++++++++++++++++++++++++++++++++DONE");
			session.getTransaction().commit();

		} finally {

			factory.close();
		}
	}
}