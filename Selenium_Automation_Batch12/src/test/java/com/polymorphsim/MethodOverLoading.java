package com.polymorphsim;

public class MethodOverLoading {

	public void getInfo(String name) {
		System.out.println("My name is : " +name);				
	}	
	
	
	public void getInfo(double age) {
		System.out.println("My Age :" +age);
	}
	
	public void getInfo(int salary, int id) {
		System.out.println("My Salary  :" +salary +" My Id num : "+ id);
	}
	
	public void getInfo(String SSN, String Add) {
		System.out.println("My SSN Num  :" +SSN +" My address : "+ Add);	
	}
		
	public static void main(String[] args) {
	
		MethodOverLoading obj = new MethodOverLoading(); // Default constructor
		
		
		obj.getInfo("Alam");
		obj.getInfo(40);
		obj.getInfo(9000, 100);
		obj.getInfo("122-12-1234", "72-08 Broadway");
		
	}
	
	
	
}
