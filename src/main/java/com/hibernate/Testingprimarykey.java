package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Testingprimarykey {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			Student thestudent = new Student("Taylor", "Shift", "Talyor@55gmail.com");
			Student thestudent2 = new Student("aaneesha", "ashetty", "aneesha@55gmail.com");
			Student thestudent3 = new Student("asomya", "ashetty", "somya@55gmail.com");
			Student thestudent4 = new Student("arani", "ashetty", "rani@55gmail.com");
			session.beginTransaction();
			session.save(thestudent);
			Student mystudent = session.get(Student.class, thestudent.getId());
			System.out.println("h%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			System.out.println("Outputting from the database" + mystudent);
			session.getTransaction().commit();

		} finally {

			factory.close();
		}
	}
}