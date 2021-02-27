package com.nyc.inheritance;

public class EncapsulationTest {
		
	private String name = "Mohammed Alam";
	private int salary = 1007000;
	private String role = "Automation Engineer";
	
	
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String getRole() {
		return role;
	}

	public static void main(String[] args) {
		EncapsulationTest obj = new EncapsulationTest();
		System.out.println(obj.getName());
		obj.getSalary();
		obj.getRole();
	}

}
