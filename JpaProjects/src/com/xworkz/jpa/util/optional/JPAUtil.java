package com.xworkz.jpa.util.optional;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory createEntityManagerFactory;
	private  static EntityManagerFactory getFactory() {
		return createEntityManagerFactory;
		
	}
	
	static {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
	}

}
