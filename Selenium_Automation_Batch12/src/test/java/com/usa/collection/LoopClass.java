package com.usa.collection;

import java.util.Arrays;

public class LoopClass {

	// What is the loop?
	// Loop is nothing but count the value, break the value & continue the value
	
	// How many loop in java
	// There is a many loop
	// for loop   ---  100 --- 90%
	// advance for loop  -- 100 - 10%
	// while loop
	// do while loop
	
	public static void main(String[] args) {
		
		int [] number = {1,3,3,4,5,6,2,3,4,5,667,7,7,88,8};		
		// advance for loop
		for (int i:number ) {
			//System.out.println(i);
		}	
		// for loop
	    for (int i = 0; i< number.length; i++) { // Formula
		//System.out.println(number[i]);
		}
	    
	    String []name = {"Mir","Habib","Sazzad","Sadiya"};
	    
		for (String i : name)	{
			System.out.println(i);
		}
			

	}

}
