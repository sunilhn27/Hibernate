package com.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.OneToOnepractice.Instructor;
import com.OneToOnepractice.InstructorDetail;

public class CourseMain {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		int id = 1;

		Instructor tempins = session.get(Instructor.class, id);

		Course tempcourse = new Course("Fifty Sades Of Grey");
		Course tempcourse2 = new Course("Sage In Love");
		Course tempcourse3 = new Course("Man Plans God Laughs");

		tempins.add(tempcourse);
		
		
		session.beginTransaction();

	}
}
