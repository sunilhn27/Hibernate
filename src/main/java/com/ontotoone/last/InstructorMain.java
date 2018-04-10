package com.ontotoone.last;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.OneToOnepractice.Instructor;
import com.OneToOnepractice.InstructorDetail;

public class InstructorMain {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		int id = 6;

		Instructor tempin = session.get(Instructor.class, id);

		// tempin.getInstructor();

		session.delete(tempin);

		System.out.println("deleted");

		System.out
				.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%Sage%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		session.getTransaction().commit();

	}
}
