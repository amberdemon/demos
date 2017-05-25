package com.warrengreen.user;

import javax.persistence.Id;

import lombok.Data;

@Data
public class User {

	@Id
	private int userID;
	private String name;
	private int age;
	private String address;
}
