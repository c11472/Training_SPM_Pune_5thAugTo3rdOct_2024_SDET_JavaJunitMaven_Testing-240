package com.programs.day3;

public class AccessData {
	public static void main(String args[]) {
		HiddenFrameworks obj =
				new HiddenFrameworks("testuser","187987");
		obj.setName("Testing240");
		String name1=obj.GetName();
		System.out.println(name1);
		
		obj.setID("11472");
		String i1=obj.GetID();
		System.out.println(i1);
		
	}
}
