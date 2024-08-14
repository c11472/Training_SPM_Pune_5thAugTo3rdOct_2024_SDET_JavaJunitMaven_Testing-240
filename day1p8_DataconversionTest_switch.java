package com.programs.day1;
/*
 * Converting String to primitive
 */
import java.util.Scanner;

public class day1p8_DataconversionTest_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//price as an input
		String price;
		
		Scanner c = new Scanner(System.in);
		
		System.out.println("Enter the price : ");
		
		price = c.next();
			
		
		// caseindex input
		
		int caseindex;
		
		System.out.println("Enter case index :");
		
		caseindex = c.nextInt();
		
		// define switch
		
		switch(caseindex)
		{
		
		case 1:
			System.out.println("Convert  string to double");
			double ConverToDouble = Double.parseDouble(price);
			System.out.println(ConverToDouble);
			
			break;
			
			
		case 2:
			System.out.println("Convert String to int");
			int ConvertToInt = Integer.parseInt(price);
			System.out.println(ConvertToInt);
			break;
			
			
		case 3:
			System.out.println("Convert stringo float");
			float ConverToFloat = Float.parseFloat(price);
			System.out.println(ConverToFloat);
			break;
			
			
		default:
			System.out.println("Invalid case index");
		}
			
			
		
		
		
		
		
		
		
	}

}
