package com.warrengreen.address;

import javax.persistence.Id;

public class Address {

	@Id
	private int id;
	private int doorNumber;
	private String streetName;
}
