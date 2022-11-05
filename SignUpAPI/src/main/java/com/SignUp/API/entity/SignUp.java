package com.SignUp.API.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SignUpAPI")
public class SignUp {

	@Id
	private int id;
	private String firstName;
	private String LastName;
	private String email;
	private String number;
	private String password;

	public SignUp(int id, String firstName, String lastName, String email, String number, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
		this.number = number;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Truck [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + ", email=" + email
				+ ", number=" + number + ", password=" + password + "]";
	}

	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
