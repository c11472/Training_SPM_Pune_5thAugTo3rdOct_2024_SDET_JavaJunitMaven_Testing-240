package com.programs.day3;

import java.util.ArrayList;

public class ObjectClassDemo extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessATMSampleInterface obj = new AccessATMSampleInterface();
	/*	obj.equals(obj);----> Object class
		obj.hashCode(); -----> Object class
		obj.toString(); ------> Object class*/
		
		Object num1 = "Test automation";
		
		String code1="101";
		String code2="101";

		Object sal = 67000.67;
		
		System.out.println(num1+ " "+code1+ " "+sal);
		
		if(num1.equals(code1)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Invalid");
		}
		
		ArrayList <Integer> al = new ArrayList();
		al.add(10);
		al.add(11);
		System.out.println(al);
		
		System.out.println(al.toString());
		
		System.out.println(code1.hashCode());
		System.out.println(code2.hashCode());
		
		

	}

}
