package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class studentdemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		try {

			Session session = factory.getCurrentSession();

			System.out.println("Creating obj**********************************************************");

			Student thestudent = new Student("magana", "shetty", "magana@55gmail.com");
			Student thestudent2 = new Student("aneesha", "shetty", "aneesha@55gmail.com");
			Student thestudent3 = new Student("somya", "shetty", "somya@55gmail.com");
			Student thestudent4 = new Student("rani", "shetty", "rani@55gmail.com");

			session.beginTransaction();

			System.out.println("creating session ##########################################################");

			session.save(thestudent);

			System.out.println("commting&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

			session.getTransaction().commit();

		} finally {
			factory.close();
		}

	}
}
