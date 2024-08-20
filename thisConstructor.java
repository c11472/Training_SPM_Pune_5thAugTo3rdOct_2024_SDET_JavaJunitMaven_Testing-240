package com.programs.day4;

public class thisConstructor {
	thisConstructor() {
		System.out.println("Dummy print statement");
	}
	thisConstructor(int val){
		this(); // Note : Constructor call must be the first statement
		System.out.println("Param constructor");
	
		
		
	}
	
	public static void main(String args[]) {
		thisConstructor obj = new thisConstructor(100);	//param
		
	}
}
