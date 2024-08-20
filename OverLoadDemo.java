package com.programs.day4;

public class OverLoadDemo {
	public void samplemethod1() {
		System.out.println("task1");
		
	}
	public void samplemethod1(int num) {
		System.out.println("task2");

		
	}
	
	public void samplemethod1(int num, String num1) {
		System.out.println("task3");

		
	}
	
	public static void main(String args[]) {
		OverLoadDemo obj  = new OverLoadDemo();
		obj.samplemethod1();
		obj.samplemethod1(23,"test");
		obj.samplemethod1(45);
		
	}
	

}
