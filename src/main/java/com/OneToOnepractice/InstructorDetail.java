package com.OneToOnepractice;

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
public class InstructorDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "youtube_channel")
	private String youtubechannel;

	@Column(name = "hobby")
	private String hobby;

	@OneToOne(mappedBy = "instructordetail", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private Instructor instructor;

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public InstructorDetail() {
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubechannel=" + youtubechannel + ", hobby=" + hobby + "]";
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

	public InstructorDetail(String youtubechannel, String hobby) {
		this.youtubechannel = youtubechannel;
		this.hobby = hobby;
	}
}
