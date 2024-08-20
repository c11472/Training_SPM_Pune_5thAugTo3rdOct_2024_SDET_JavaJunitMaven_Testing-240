package com.programs.day4;

public class WrapperDemo {

	public static void main(String[] args) {
		
		
		// Auto boxing
       Integer it = Integer.valueOf(1147); //1147 is a primitive data
       System.out.println("Autoboxing : " + it);
       
       // Unboxing
       Integer a = new Integer(78); // Converting the wrapper object
       int b = a.intValue(); 	
       System.out.println("Unboxing : " +b);//78--- int
       
      
       
	}

}

