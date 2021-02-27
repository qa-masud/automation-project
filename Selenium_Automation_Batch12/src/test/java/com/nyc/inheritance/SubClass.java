package com.nyc.inheritance;

public class SubClass extends AbstractClassA{

	@Override
	public void getSalary() {
		System.out.println(" I am overwrite  method from abstract class ");
		
	}

	@Override
	public void getSalary1() {
		System.out.println(" I am overwrite  method from abstract class ");
	}

	@Override
	public void getSalary2() {
		System.out.println(" I am overwrite  method from abstract class ");
		
	}

public static void main(String[] args) {
	SubClass obj = new SubClass();
	obj.getSalary();
	obj.getShows();
}


	
}
