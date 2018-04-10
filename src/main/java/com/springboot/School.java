package com.springboot;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class School {
	/*
	 * @NotNull
	 * 
	 * @Size(min = 1, message = "Should be filled")
	 */
	@NotNull(message = "Should not Be Null")
	@Size(min = 8, message = "Should be greater Than 8 Characters")
	private String firstname;
	@NotNull
	@Size(min = 5, message = "Should be greater Than 5 Characters")
	private String lastname;

	@Min(value = 1, message = "must be greater than  0 ")
	@Max(value = 10, message = "must be less than 10 ")
	private int freepasses;

	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 character allowed")
	private String zipcode;

	public int getFreepasses() {
		return freepasses;
	}

	public void setFreepasses(int freepasses) {
		this.freepasses = freepasses;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
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

}