/******
 * This code is to perform various operation in a single dim array.
 * 1. Display the array
 * 2. Sum of all elements present in array
 * 3. Sort array in ascending order
 *
 * 
 *********/

package com.programs.day2;
import java.util.Arrays;
/***
 * This code is the demo for passing array as a parameter to the method
 */
import java.util.Scanner;

public class day2_p6_PassingArrayAsParamToMethod {
	int i;
	// method to display the array values
	public  static void ArrayDisplayData(int arrayvalues[]) {
		int j;
		//Scanner c  = new Scanner(System.in);	
		// Display data
		for( j=0;j<=arrayvalues.length-1;j++) {
			System.out.println(arrayvalues[j]);
		   
		} 	
	} // method to display the array values
	
	// Count the even numbers
	
	public int Count_Even_NumbersInArray(int arrayvalues[]) {
		int count=0;
		for(i=0;i<=arrayvalues.length-1;i++) {
			if(arrayvalues[i]%2==0) {
				
				count = count+1;
				
			}
			
			//System.out.println(count	
		}
		System.out.println("Total even numbers in arrayvalues is:" + " "+ count);
		return count;
		
	}
	
	public void Array_SortData(int arrayvalues[]) {
	    Arrays.sort(arrayvalues); // one line code to sort the array
	   
	    for(int j:arrayvalues) {
	    	System.out.print(j+ " ");
	    	
	    	
	    }
		
	}
	
	
	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int arrayvalues[]= {20,45,89,12,17,90,67,40,32,10}; // hard coded array
		
		day2_p6_PassingArrayAsParamToMethod obj1 = new  day2_p6_PassingArrayAsParamToMethod();
	    
		
		int caseindex;
		Scanner c = new Scanner(System.in);
		
		System.out.println("Enter the case index");
		
		caseindex = c.nextInt();
		
		switch(caseindex) {
		case 1:
			ArrayDisplayData(arrayvalues);
			break;
		case 2:
			obj1.Array_SortData(arrayvalues);
			break;
		case 3:
			obj1.Count_Even_NumbersInArray(arrayvalues);
			break;
		default:
			System.out.println("Invalid choice");
		}
		}
		
		
	
	}
