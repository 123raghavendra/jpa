package com.xworkz.jpa.constants;

import javax.management.loading.PrivateClassLoader;

public enum Type {

	FOOTBALL("FOOTBALL"), CRICKET("CRICKET"), BASKETBALL("BASKETBALL"), TENNIS("TENNIS"), HOCKEY("HOCKEY");

	private String value;

	private Type(String value) {
		this.value = value;
		
		
		
	}

}
