package com.programs.day2;

public class day2_p7StringArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cities[] = {"Pune","Vhennai","Noida",
				"BBSR","Kochin"};
		
		// Traditional for loop
		// for - each
		
		for(String i:cities) {
			System.out.print(i+ " ");
		}
		
		
		// traditional for loop
		
		for(int i=0;i<=cities.length-1;i++) {
			System.out.println(cities[i]);
		}

	}

}
