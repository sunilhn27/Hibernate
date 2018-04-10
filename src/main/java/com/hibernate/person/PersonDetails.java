package com.hibernate.person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person_details")
public class PersonDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "youtube_channel")
	private String youtubechannel;

	@Column(name = "hobby")
	private String hobby;

	public PersonDetails() {

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

	public PersonDetails(String youtubechannel, String hobby) {
		this.youtubechannel = youtubechannel;
		this.hobby = hobby;
	}

}
