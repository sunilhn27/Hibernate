package com.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructor")
public class Instructor {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "fist_name")
	private String firstname;

	@Column(name = "last_name")
	private String lastname;

	@Column(name = "email")
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_id")
	private Instructordetail instructordetails;

	@OneToMany(mappedBy = "instructor", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private List<Course> course;

	public Instructor() {

	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Instructor(String firstname, String lastname, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Instructordetail getInstructordetails() {
		return instructordetails;
	}

	public void setInstructordetails(Instructordetail instructordetails) {
		this.instructordetails = instructordetails;
	}

	public void add(Course tempcourse) {

		if (course == null) {
			course = new ArrayList<>();
		}

		course.add(tempcourse);

		tempcourse.setInstructor(this);

	}

}
