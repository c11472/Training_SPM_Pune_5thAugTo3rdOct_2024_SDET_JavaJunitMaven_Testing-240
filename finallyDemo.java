package com.programs.day4;

public class finallyDemo {

	public static void main(String args[])
	{
		try {
			int arr[] = {1,2,3};
			System.out.println(arr[9]);
			
		}
		finally {
			System.out.println("HEllo");
		}
		try {
			int p;
			p = (Integer) null;
			System.out.println(p);
			
			
		}
		finally {
			System.out.println("Hi");
		}
		try {
			String s = "good";
			System.out.println(s.charAt(9));
			
		}
		finally {
			System.out.println("there");
		}
		
	}
}

