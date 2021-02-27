package com.nyc.inheritance;

public class Kids extends Child{

	
	public void getShows() {
		System.out.println("Kids have many shows ");
	}
	
	
	public static void main(String[] args) {
		Kids obj = new Kids();
		obj.property();
		obj.car();
		obj.getShows();
	}
}
