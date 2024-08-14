package com.programs.day1;

import java.util.Scanner;

public class day1_p6_datainp {

	public static void main(String[] args) {
		// TODO Auto-generated method stubin
		
		String empName;
		double empsal;
		int empid;
		
		char section;
		
		
		// Provide the input

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		empName=sc.next();
		System.out.println(empName);
		
		//System.out.println("The Employee Name is : " + empName);
		System.out.println("Enter sal");

		empsal = sc.nextDouble();
		System.out.println("Employee salary is: " + empsal);

		
        System.out.println("Enter id");
		empid = sc.nextInt();
		System.out.println("The EmployeeId is : " + empid);
		
		// Character input
		System.out.println("Enter section");
		
		section = sc.next().charAt(0);
		System.out.println("The section is :" + section);
		
		
		

	}

}
