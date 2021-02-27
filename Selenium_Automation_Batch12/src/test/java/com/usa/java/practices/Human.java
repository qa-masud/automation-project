package com.usa.java.practices;

public class Human{

      // Public means access for all the class within project 
      public void math() {
    	  int salary = 100000;
    	  int anum = 5000;     	  
    	  int total = salary*anum;	  
    	  System.out.println(total);   	  		
	}
      
      public static void main(String[] args) {
    	  Human obj = new Human();
    	  obj.math();
	}
	
}
