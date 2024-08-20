package com.programs.day4;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[3][3];
		int i,j;
		Scanner c = new Scanner(System.in);
		
		// Array Input
		
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				arr[i][j]=c.nextInt();
				
			}
		}
		
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				if(i==j) {
				System.out.print(arr[i][j] + " ");
				}
			}
				
		   }
			System.out.println();
		}
		
		

	}


