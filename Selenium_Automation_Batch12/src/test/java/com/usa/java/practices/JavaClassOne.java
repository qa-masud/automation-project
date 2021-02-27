package com.usa.java.practices;

public class JavaClassOne {

	// This is a method 
	// static method we can call by class name Note: We don't need create object
     static void getSalary(){ 
    	  int salary = 110000; // This are local variable
    	  int anum = 4000;
    	  int vaction = 3600;    	  
    	  int total = salary + anum + vaction;
    	  System.out.println("My total salary per year : $ " + total);   	  
      }
      
    // Void method call by creating object  
    void getName(){
    String firstNane = "Alam";  
    String lastName = " Mohammed "; 
    	  String myName = firstNane + lastName;
    	  System.out.println("My name is  : $ " + myName);   	  
      }
      
 public static void main(String[] args) {
	 
	 // How you can call static method or variable?
	 // By class name! we don't to create object 
	 JavaClassOne.getSalary();
     // How can call void method?
	 // Ans-:  We can call creating object
	 // How you crate object?
	 // Ans-: By Class name 
	 // How java understand you create the object? 
	 // When we create object with new key word java i am create object
	 JavaClassOne obj = new JavaClassOne(); 
	 //obj.getSalary();
	 obj.getName();
}
}
