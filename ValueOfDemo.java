package com.programs.day1;

public class ValueOfDemo {
	
	public static void main(String args[]) {
		String price = "99999";
		
		String price1 = "999.95";
		
		String price2 = "10.5";
		
		System.out.println(Integer.valueOf(price)); // string to int
		
		System.out.println(Double.valueOf(price1)); // string to primitive
		 
		System.out.println(Float.valueOf(price2)); // string to float
		
		
		int res1 = Integer.valueOf(price);
		System.out.println("Converted int value is : " + " "+ res1);
		
		double res2 = Double.valueOf(price1);
		System.out.println("Converted double value is : " + " " + res2);
		
		float res3 = Float.valueOf(price2);
		System.out.println("Converted float value is : " + " "+ res3);
		
		
		
		
		
	}

}
