package com.programs.day4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class MultipleCatchAndSingleTry {
	public static void main(String args[]) {
		
		int num=100;
		int arr[] = {1,2,3,4,5};
		
		try {
			System.out.println(num/0);
			System.out.println(arr[100]);
		}
		catch(ArithmeticException e) {
			System.out.println("This is due to devide by 0");
		}
		
		catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("This is handeled");
			
		}
		
		
		
	    
	}

}
