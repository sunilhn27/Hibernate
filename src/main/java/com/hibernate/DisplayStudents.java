package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DisplayStudents {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			List<Student> thestudents = session.createQuery("from Student").list();
			System.out.println("DIsplaying data form the database *****************************************************************");
			for (Student tempstudent : thestudents) {
				System.out.println(tempstudent);
			}

			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}
}