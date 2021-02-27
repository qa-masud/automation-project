package com.polymorphsim;

public class ChildClass extends FatherClass{
	
	ChildClass(int a){
		System.out.println(a);
	}
	
	public void getFtrher() {
		super.getFtrher();

		System.out.println("I am child class ");

	}
	
	
	public static void main(String[] args) {
		ChildClass obj = new ChildClass(100);
		obj.getFtrher();
		
		
	
		
	}
}
