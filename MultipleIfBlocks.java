package com.programs.day1;

import java.util.Scanner;

public class MultipleIfBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String EmpDept = "HR";
		
		double EmpSal = 34000.90;
		Scanner sc = new Scanner(System.in);
		
		if(EmpDept=="HR") 
		{ 
		   if(EmpSal<40000.00) 
			{
				System.out.println(EmpDept + " " + EmpSal);
			}
		}
		
		String empid = sc.next();
		
		
		if(empid.contains("ID")) {
			System.out.println("Valid ID");
			
		}
		else {
			System.out.println("Invalid Employee ID");
		}
		
	
	}	

}


