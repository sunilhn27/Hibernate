package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class sss {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		List<Student> student = session.createQuery("from Student").list();

		Student s = session.get(Student.class, 4);

		session.delete(s);

		s.setFirstname("sunil1");
		s.setLastname("shetty1");
		s.setEmail("gmail1");
		session.getTransaction().commit();

	}
}
