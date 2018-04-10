package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class displaying {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		try {
			Session session = factory.getCurrentSession();
			session.beginTransaction();

			int id = 8;
			Student stu = session.get(Student.class, id);
			stu.setFirstname("Hanish");
			stu.setLastname("Handey");
			stu.setEmail("Hanish@gmail.com");

			List<Student> stu1 = session.createQuery("from Student s where s.firstname='Hanish'").list();

			System.out.println("FFFFFFFFFFFFFFFFFFFFF" + stu1);
			/*
			 * List<Student> mystudent =
			 * session.createQuery("from Student s where s.firstname='Meredith'").list();
			 * for (Student temp : mystudent) { System.out.println(temp); }
			 */session.getTransaction().commit();
		} finally {
			factory.close();
		}

	}
}