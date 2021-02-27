package com.polymorphsim;

public class ABC {
	
	
	public static void main(String[] args) {
		ABC obj = new ABC();
		
		
	}
	
	
	public void AnimalSound() {
	
	System.out.println("Animal sound");	
	
	}
	
	
	
	
	
	class animal extends ABC{
		public void AnimalSound() {
		System.out.println("Animal sound");	
			
		}
	}
}
