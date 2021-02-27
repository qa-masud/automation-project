package com.polymorphsim;

public class ThisKeywordClass {
	
	String name;
	int age;
		
	public ThisKeywordClass(String names, int num) {
	
		this.name = names;
		this.age = num;
		
		System.out.println(name + num);
	}
	
	
	public static void main(String[] args) {
		ThisKeywordClass obj = new ThisKeywordClass("Alam", 100);		
	
	}

}
