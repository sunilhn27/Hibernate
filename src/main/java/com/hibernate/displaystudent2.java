
package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class displaystudent2 {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			List<Student> thestudents = session.createQuery("from Student").list();

			displayforloop(thestudents);

			System.out.println(
					"Last name :***********************************************HHHHHHHHHHH(************************");
			thestudents = session.createQuery("from Student s where s.lastname='shetty'").list();
			displayforloop(thestudents);
			System.out.println("fname and lastname using(((((((((((((((((((((((((((((((((((((((((((((((((");
			thestudents = session.createQuery("from Student s where s.lastname='shetty' OR s.firstname='aneesha'")
					.list();
			displayforloop(thestudents);
			System.out.println("LIKE Using))))))))))))))))))))))))))))))))))");
			thestudents = session.createQuery("from Student s where s.email LIKE '%yahoo.com'").list();
			displayforloop(thestudents);

			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}

	private static void displayforloop(List<Student> thestudents) {
		for (Student mystudent : thestudents) {
			System.out.println(mystudent);
		}
	}
}
