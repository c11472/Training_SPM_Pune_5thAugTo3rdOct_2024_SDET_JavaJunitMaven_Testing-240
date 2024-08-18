/*******
 * Code to demonstrate all the String Class methods
 * to operate on strings
 */

package com.programs.day2;

import java.util.Scanner;

public class day2_p1StringDemo {

	public static void main(String[] args) {
		 
		String TrainingDetails = "QATesting-Training-Testing-240-Loc-PDC-Room-05"; // hard coded
		String TrainingRoomCode = "Loc PDC Room 05";
		String TRC = "Loc PDC Room 05";
		
		String st1="test";
		String st2="";
		
		
		String hsc1 = "abc";
		String hsc2 = "abctest123";
		
		char ch1 = TrainingDetails.charAt(14);
		System.out.println("The character extracted:" + " "+ ch1);
		
		String concatresult=TrainingDetails.concat("%$#");
		System.out.println(concatresult);
		
		if(TrainingRoomCode.equals(TRC)) {
			System.out.println("Same content");
		}
		else {
			System.out.println("Different content");
		}
		
		if(TRC.contains("$$$&^ %^&123")) {
			System.out.println("Valid TRC");
		}
		else {
			System.out.println("Invalid TRC");
		}
		
		int cno = TRC.compareTo(TrainingRoomCode);
		System.out.println(cno); //0   --- same value
		
		
		if(TRC.equalsIgnoreCase("LOC pdc RooM 05")) {
			System.out.println("same");
		}
		else {
			System.out.println("invalid");
		}
		
		
		String replacedval=TRC.replace("Loc", "Location");
		System.out.println(replacedval);
		
		String arr1[]=TrainingDetails.split("-");
		for(String j:arr1) {
			System.out.println(j);
			
		}
		
		System.out.println(TrainingDetails.indexOf("240"));
		
		System.out.println(TRC.repeat(5));
		
		System.out.println(TRC.length());
		
		char resarr[] = TRC.toCharArray();
		
		for(char i:resarr) {
			System.out.println(i);
		}
		
		/*if(st1.isEmpty()) {
			System.out.println("True");
		}
		else {
			System.out.println("non empty string");
		}*/
		
		if(st2.isBlank()) {
			System.out.println("True");
		}
		else {
			System.out.println("non empty string");
		}
		
		
		System.out.println(TRC.substring(7,12));
		String trn = "     Test data test";
		System.out.println(trn);
		System.out.println(trn.trim());
		
		
		System.out.println(hsc1.hashCode());
		System.out.println(hsc2.hashCode());
		


/*		
		EmpID.charAt(0)
		EmpID.compareTo(EmpID)
		EmpID.concat(EmpID)
		EmpID.compareToIgnoreCase(EmpID)
		EmpID.contains(EmpID)
		EmpID.endsWith(EmpID) ////
		EmpID.startsWith(EmpID) //
		EmpID.replace(EmpDept, EmpID)
		EmpID.repeat(0)
		EmpID.hashCode()
		EmpID.equals(c)
		EmpID.indexOf(0)
		EmpID.isEmpty()
		EmpID.isBlank()
		EmpID.length()
		EmpID.split(EmpID, 0)
		EmpID.substring(0, 0)
		EmpID.toCharArray()
		EmpID.toLowerCase()
		EmpID.toUpperCase()
		EmpID.trim()
		EmpID.repeat(0)
		
	*/	

	}

}
