package com.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructor_detail")
public class InstructorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "youtube_channel")
	private String youtubechannel;

	@Column(name = "hobby")
	private String hobby;

	@OneToOne(mappedBy = "instructordetails", cascade = CascadeType.ALL)
	private Instructor instructor; 

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public InstructorDetails() {

	}

	public InstructorDetails(String youtubechannel, String hobby) {
		this.youtubechannel = youtubechannel;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubechannel() {
		return youtubechannel;
	}

	public void setYoutubechannel(String youtubechannel) {
		this.youtubechannel = youtubechannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "InstructorDetails [id=" + id + ", youtubechannel=" + youtubechannel + ", hobby=" + hobby + "]";
	}
}
