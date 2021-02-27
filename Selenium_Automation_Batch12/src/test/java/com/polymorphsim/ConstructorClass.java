package com.polymorphsim;

public class ConstructorClass {

	//int number;
	//static int num = 100;
	
	ConstructorClass(int age, String name){
	//this.number = age;
	//this.num = salary
		System.out.println(age + name);
		
	}
	
	 ConstructorClass(String age, int salary){
	//this.number = age;
	//this.num = salary
		System.out.println(age + salary);
		
	}
	
	ConstructorClass(int age, int salary){
	//this.number = age;
	//this.num = salary
		System.out.println(age + salary);
		
	}
	
	public void getAddress() {
		System.out.println("My add 72-08 Broadway");
	}
	public static void main(String[] args) {
		ConstructorClass obj = new ConstructorClass(20, 1000);
		ConstructorClass obj1 = new ConstructorClass(20, "Alam");

		
	}
}
