package com.programs.day1;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("While loop demo");
		
		
		int n=0;
		String password;
		Scanner c = new Scanner(System.in);
		
		while(n<=2) {
			password=c.next();
			
			System.out.println(password);
			
		     n++;
		}

	}

}
