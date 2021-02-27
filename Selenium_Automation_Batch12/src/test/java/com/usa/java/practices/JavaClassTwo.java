package com.usa.java.practices;

public class JavaClassTwo {
	
	static String studentName;
	static int id ;
	static int age;
	String name;
	
	   public static void main(String[] args) {
		   //System.out.println(JavaClassTwo.getMyName());
		  JavaClassTwo obj = new JavaClassTwo();
		  obj.localMethod();
		  //System.out.println(obj.getMyName());
		   //JavaClassTwo.getAge();
		   //JavaClassTwo.getID();
		   //JavaClassTwo.localMethod();		   
	   }	
	
	public void getStudent() {
		name = "Liton";
		studentName = "(Mahmood)";
		id = 234233;
		age = 18;
		System.out.println("My name is : "+studentName +" My ID Num : "+ id + " My age is : "+ age);
		
	}	
	public static void getID() {
		// name = "fdyuytr";
		studentName = "Parvaze";
		id = 234222;
		age = 19;
		System.out.println("My name is : "+studentName +"My ID Num : "+ id + "My age is : "+ age);
		
	}
	
	public static void getAge() {		
		studentName = "Sultana";
		id = 234211;
		age = 20;
		System.out.println("My name is : "+studentName +"My ID Num : "+ id + "My age is : "+ age);
		
	}
	
     	public void localMethod() {
	
	}

	     int getMyName(){
			return 0;

		
	}
	
	
	

}




