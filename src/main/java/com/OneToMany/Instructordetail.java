package com.OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructor_detail")
public class Instructordetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "youtube_channel")
	private String youtubechannel;

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Column(name = "hobby")
	private String hobby;

	@OneToOne(mappedBy = "instructordetails")
	private Instructor instructor;

	public Instructordetail() {

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

	public Instructordetail(String youtubechannel, String hobby) {
		this.youtubechannel = youtubechannel;
		this.hobby = hobby;
	}
}
