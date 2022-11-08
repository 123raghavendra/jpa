package com.obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class WaysOnj implements Cloneable, Serializable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, CloneNotSupportedException, IOException, ClassNotFoundException {

		// using new
		WaysOnj onj = new WaysOnj();
		System.out.println(onj);
		// newinstance method of class class
		WaysOnj newInstance = WaysOnj.class.newInstance();
		System.out.println(newInstance);
		// new instance method of constructor class
		Constructor<WaysOnj> constructor = WaysOnj.class.getConstructor();
		System.out.println(constructor);
		// using clone method
		// our class clonable interface na impliment
		// clone method internaly super
		// shollow
		// deep

		WaysOnj waysOnj = new WaysOnj();
		Object clone = waysOnj.clone();
		WaysOnj onj2 = (WaysOnj) clone;
		// serialization
		String name = "manoj.ser";
		FileOutputStream stream = new FileOutputStream(name);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);

		objectOutputStream.writeObject(waysOnj);
		stream.close();
		objectOutputStream.close();
		// deserialization
		FileInputStream stream2 = new FileInputStream(name);
		ObjectInputStream stream3 = new ObjectInputStream(stream2);
		Object readObject = stream3.readObject();
		WaysOnj onj3 = (WaysOnj) readObject;
		
		
		// foctory method 
		// nange gothila 
		

	}

}
