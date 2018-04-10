package com.OneToOnepractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Instructormain {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		Instructor tempinstructor = new Instructor("raju", "kiran", "raj@kiran.com");

		InstructorDetail tempdetails = new InstructorDetail("www.rajkiran.com", "Singing");

		System.out
				.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%Sage%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		tempinstructor.setInstructordetail(tempdetails);

		System.out.println("saved");
		session.save(tempinstructor);

		session.getTransaction().commit();

	}
}
