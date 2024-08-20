package com.programs.day4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestLib {
	public void testconcat() {
		String s="Hello";
		System.out.println(s.concat("test1"));
	}
	
	public void testarr() throws ArrayIndexOutOfBoundsException {
		int arr[] = {1,4,5,7,9};
		System.out.println(arr[10]);
		
	}
		
	public void problem1() throws FileNotFoundException {
		FileReader fr = new FileReader("E://sample//test1.txt");
		
	}
	

}
