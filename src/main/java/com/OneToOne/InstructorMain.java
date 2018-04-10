package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InstructorMain {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		int id = 13;

		

		InstructorDetails insdet = session.get(InstructorDetails.class, id);
		System.out.println("*********************************dd***************************************");
		System.out.println("details***************   " + insdet);

		System.out.println("*********************************dd***************************************");

		System.out.println("instructor ********************  " + insdet.getInstructor());

		session.getTransaction().commit();

	}
}
