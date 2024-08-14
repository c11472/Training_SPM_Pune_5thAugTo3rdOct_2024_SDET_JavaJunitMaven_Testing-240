package com.programs.day1;

import java.util.Scanner;

public class Calculate_NetSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String EmpName = "A";
		double Empsal; // input
		
		String dept;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ask A to enter his salary:");
		
		Empsal = sc.nextDouble();
		System.out.println("Ask A to enter his dept name");
		
		dept = sc.next();
		System.out.println("Salary before hike for " + EmpName + " "+ Empsal);
		
		System.out.println("Check if A is eligible to get hike");
		
		
		
		if((Empsal<32000.00) || (dept=="QA")) {
			
			double Netsal = (Empsal*10/100)+Empsal;
			System.out.println("net sal" + Netsal );
			
		}
		else {
			
			System.out.println("Person is not eligible to get hike");
			
		}

	}

}
