package com.programs.day2;

import java.util.Scanner;
/******
 * This is the code to demonstrate 
 * the return type method to reverse the string 
 * using StringBuffer
 * @author Gayatri 
 */
public class day2_p4ReturnTypeMethodDemo {
	//define method
	
	public StringBuffer ReverseTheString() {
		String inp;
		System.out.println("Enter the string");
		Scanner c = new Scanner(System.in);
		
		inp=c.nextLine();
		StringBuffer sb = new StringBuffer(inp);
		
		StringBuffer rev = sb.reverse();
		return rev;
		
		
	}
	
    // main block
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Create an object 
		day2_p4ReturnTypeMethodDemo test = new day2_p4ReturnTypeMethodDemo();
		// method call
		StringBuffer result = test.ReverseTheString();
		System.out.println(result);

	}
	

}
