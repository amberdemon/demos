package com.warrengreen.user;

import javax.persistence.Id;

import com.warrengreen.address.Address;

import lombok.Data;

@Data
public class User {

	@Id
	private int userID;
	private String firstName;
	private String lastName;
	private int age;
	private Address address;
}
