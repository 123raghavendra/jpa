package com.xworkz.protecteddemo.otherpackage;

import com.xworkz.protecteddemo.Parent;

public class IAmChildDifferentPackage extends Parent {

	public static void main(String[] args) {
		IAmChildDifferentPackage iAmChildDifferentPackage = new IAmChildDifferentPackage();
		Parent parent = new Parent();
		Parent differentPackage = new IAmChildDifferentPackage();
		iAmChildDifferentPackage.m1();
		if() {
			
		}
		

	}

}
