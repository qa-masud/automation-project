package com.nyc.inheritance;

public class Child extends Parente{
	
	public void car() {
		System.out.println("I have BMW car");
	}

	
	public static void main(String[] args) {
		
		Child prop = new Child();
		prop.property();
		prop.car();
		
	}
}
