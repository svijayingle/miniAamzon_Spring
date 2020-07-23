package com.demo.spring.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
public class User implements Serializable{
	
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", phone=" + phone
				+ ", email=" + email + ", Username=" + Username + ", Password=" + Password + "]";
	}

	@Column(name="firstname")
	@NotNull(message="cant be empty")
	@Size(min=2,message="is required")
	private String firstname;
	
	@Column(name="lastname")
	@NotNull(message="cant be empty")
	@Size(min=2,message="is required")
	private String lastname;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone")
	private String phone;
	
	@Id
	@Column(name="email")
	private String email;
	
	@Id
	@Column(name="username")
	@NotNull(message="cant be empty")
	@Size(min=2,message="is required")
	private String Username;
	
	@Column(name="password")
	@NotNull(message="cant be empty")
	@Size(min=2,message="is required")
	private String Password;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
	public User(String firstname,String lastname, String address,String phone,String email,String username,String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
		this.email = email;
		Username = username;
		Password = password;
	}
	public User() {}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
