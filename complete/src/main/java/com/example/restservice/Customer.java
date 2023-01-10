package com.example.restservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long id;

	private final String name;
	private final String firstname;
	private final String email;
	private final String address;

	public Customer(long id, String name, String firstname, String email, String address) {
		this.id = id;
		this.name = name;
		this.firstname = firstname;
		this.email = email;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

}
