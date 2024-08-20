package com.programs.day4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	try {
		FileReader fr = new FileReader("D://sample123.txt");
        Properties p = new Properties();
        p.load(fr);
        System.out.println(p.get("test"));
	}
	catch(FileNotFoundException e4){
		System.out.println("This is FileNotFoundException");
		//System.out.println(e4.getStackTrace());
        // e4.printStackTrace();		
	}
        
	
		//System.out.println("File Not Found !");
		
	
		
		/*int num= 199;
		
		System.out.println(num/0);*/
	try {	
	    int arr[] = {12,16,89};
	    System.out.println(arr[5]); //ArrayIndexOutOfBoundsException
	    
	}
	catch(ArrayIndexOutOfBoundsException  e) {
		System.out.println("Hello world");
		
	}
	
	try {
		int num=100;
		System.out.println(num/0);
	    }
	catch(ArithmeticException e1) {
		System.out.println("This is a number format exception");
	}
	try {
	String s = "This is exception";
	System.out.println(s.charAt(56)); 
	}
	catch(StringIndexOutOfBoundsException e5) {
		System.out.println("Exception Handeled");
	}
	
	
	}

}
