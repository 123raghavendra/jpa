package com.xworkz.protecteddemo;

public class SamePackageButChild extends Parent{
	
	
	
	
	
	public static void main(String[] args) {
		SamePackageButChild child = new SamePackageButChild();
		 Parent parent = new Parent();
		 Parent child2 = new SamePackageButChild();
		 
		 
		 
		 child.m1();
		 parent.m1();
		 child2.m1();
	}
	
	
	
	

}
