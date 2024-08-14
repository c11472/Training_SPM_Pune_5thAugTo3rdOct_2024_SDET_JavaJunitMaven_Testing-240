
package com.programs.day1;
/*
 * Convert String to double using valueOf()
 */
public class WrapperClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  String s = "786.90";
	  
     double d = Double.parseDouble(s);	
     System.out.println(d);
     
     int p =111111;
     String s1 = s.valueOf(p);
     
     System.out.println(s1);
     
      
      

	}

}
