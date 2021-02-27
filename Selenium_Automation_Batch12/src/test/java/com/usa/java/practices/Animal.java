package com.usa.java.practices;


// This space between package name & class name

public class Animal {
	
	static int num;
	static int number;
	
	
	
	
	static String name; //global level or class level variable
	// Global level variable we have access within project any package, 
	// any class & any method by using class name, Also we don't need to be create an object 
	
	//int number;  //Instance variable 
	// This space between class name & method name
	// After the class whatever we declare the variable that is call (Instance variable)
	// Instance variable can have access inside the class any method  

	public void getName() {	
		int num = 10000; // Local variable only within method 
		number  = 5000;
		name = "Habib";
		System.out.println(num);
	// This space inside method 
	// Inside the method whatever we write the code that is call local variable 
    // we cannot reuse the variable 		
	}
	
	public void getSalary() {	
		number = 2000; //Instance variable
		name = "Rahman";		
	}
	
    public  void getEmployees() {	
    	number = 3000; 
    	name = "Sumiya";
	}
    
    
    
    
  static  void getSalaryOne(int salary ) {
    	salary = 100000;
    	num = 2000;
    	
    }
    
    
    public static void main(String[] args) {
    	Animal obj = new Animal();
    	obj.getEmployees();
    	Animal.getSalaryOne(num);
	}
    
    
    
    
    
    
    
    
}
