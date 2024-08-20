package com.programs.day4;

public class StaticVariableDemo {
	int empid=10;
	String empnm="Gayatri";
	static String dept = "physics"; //static variable
	
		

	public static void main(String[] args) {
		
		
		StaticVariableDemo sv = new StaticVariableDemo();
		System.out.println(sv.empid);
		System.out.println(sv.empnm);
		System.out.println(dept);

	}

}
