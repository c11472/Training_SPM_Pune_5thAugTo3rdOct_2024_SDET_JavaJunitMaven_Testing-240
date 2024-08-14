package com.programs.day1;
/*
 * Converting string to primitive
 *
 */

public class day1p7DataConversionTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*/ switch case
		String -- int
		String ---- double
		String ---float*/
		String IteamPrice = "2549.50"; // Extracted data from the amazaon page
		
		System.out.println(IteamPrice+1000.50);
		// Conver the string to decimal
		
		double convertedPrice = Double.parseDouble(IteamPrice);
		
		System.out.println("Converted price is : " + convertedPrice);
		System.out.println(convertedPrice+1000.00);

	}

}
