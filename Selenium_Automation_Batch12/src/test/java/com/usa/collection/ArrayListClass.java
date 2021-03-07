package com.usa.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;
import java.util.stream.Collectors;

public class ArrayListClass {
	public static void main(String[] args) {
		// how to declare array list?
		// one way
		//ArrayList num = new ArrayList(); // array length is fixed
		//num.add(1);  // 0
		//num.add(4);	//1
		//num.add(6); //2
		//num.add("Alam");  
		//num.add("Alam");  
		//num.add("null");
		//num.add("null");
		
	//	System.out.println(num.get(3)); // to get specific value
	//	System.out.println(num.size()); // to get the array length by size method
		
		//for(int i=0; i<num.size(); i++) {
		//	System.out.println(num.get(i)); // to get all the value with duplication
		//}
		// how to remove the duplicate value from array list? by using distinct keyword
	//	num.stream().distinct().collect(Collectors.toList());
		//System.out.println(num); // to get all the value
		
		
		ArrayList<String> name = new ArrayList<>(); // ArrayList-class, String-Rapper class
		
		name.add("Alam");  
		name.add("Alam");  
		name.add("null");
		name.add("null");
		name = (ArrayList<String>) name.stream().distinct().collect(Collectors.toList());
		System.out.println(name);// avoid duplicate value by distinct
		// to get specific value need get method using index theory
		
		// 2nd way
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		//Another way
		//ArrayList<String> name = new ArrayList<>();
		//name.add("Alam");
		//name.add("Alam");
		
	//	ArrayList<String> name = new ArrayList<>();
		name.add("Alam");
		name.add("");
		name.add("Alam");
		name.add("Alam");
		name.add("Alam");
		name.add("Alam");
		//3rd way
ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3));
ArrayList<String> names = new ArrayList<>(Arrays.asList("Alam","Masud"));		
		
LinkedList<Integer> LinkedList = new LinkedList<>(Arrays.asList(1,2,3));

//Vector vactor = new Vector();
//num.add(1);
//num.add(1);
//num.add(1);
//num.add("Alam");
//num.add("Alam");

	}
}
