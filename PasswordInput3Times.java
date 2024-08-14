package com.programs.day1;

import java.util.Scanner;

public class PasswordInput3Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password;
		
		Scanner c = new Scanner(System.in);
		
		for(int i=0;i<=2;i++) {
			System.out.println("Enter the password");
			password = c.next();
		}
		
		for(int i=10;i>=1;i--) {
			System.out.println(i+ " ");
			
		}
		
		

	}

}
