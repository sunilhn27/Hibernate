package com.hibernate.person;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.OneToOne.Instructor;
import com.OneToOne.InstructorDetails;

public class PersonMain {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		Person tempperson = new Person("sunil", "shetty", "sunil@gmailcom");

		PersonDetails pdetails = new PersonDetails("youtubesunil.com", "Coding");

		tempperson.setPersonDetails(pdetails);

		session.save(tempperson);
		System.out.println("Successfully Saved");

		session.getTransaction().commit();
	}
}
