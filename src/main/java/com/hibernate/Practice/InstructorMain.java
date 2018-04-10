package com.hibernate.Practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.OneToOne.Instructor;
import com.OneToOne.InstructorDetails;

public class InstructorMain {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		Instructor tempi = new Instructor("sunil", "shetty", "sunil@gmailcom");

		InstructorDetail det = new InstructorDetail("sunil.com", "coding");

//		tempi.setInstructordetails(det);

		session.save(tempi);
		session.getTransaction().commit();
	}
}