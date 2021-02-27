package com.polymorphsim;

public class MethodOverridingClassB extends MethodOverridingClassA{
	
	public void getName() {
		int name = 10000;
		System.out.println("My name is : " +name);				
	}
	
	public void getAddress() {
		System.out.println("My add 72-08 Broadway");
	}
	
	
	public static void main(String[] args) {
		MethodOverridingClassB obj  = new MethodOverridingClassB();
		obj.getAddress();
		obj.getSalary();
		obj.getName();
		
	}
	

}
