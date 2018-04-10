package com.OneToOnepractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Bi_DirectionalDelete {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		int id = 3;

		InstructorDetail tempbidirectional = session.get(InstructorDetail.class, id);
		
		tempbidirectional.getInstructor().setInstructordetail(null);

		// System.out.println("S***********************" +
		// tempbidirectional.getInstructor());
		session.delete(tempbidirectional);
		session.getTransaction().commit();
		System.out.println("sucesfully deleted");
	}
}