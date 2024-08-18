/****
 * This code is demonstrating the
 * parameterized constructor in java
 */
package com.programs.day2;

public class day2_p2ConstructorDemo {
	    String EmpName;
	    String EmpId;
	    int EmpCode;
	/*public  day2_p2ConstructorDemo() {
		 this.EmpName="emp1";
		 this.EmpId = "1147";
		 this.EmpCode = 1010;
		 //System.out.println("Values initialized !");
	}*/
	    
	    public  day2_p2ConstructorDemo(String ename , String eid , int ecode) {
	    	this.EmpName=ename;
	    	this.EmpId=eid;
	    	this.EmpCode=ecode;
	    	
	    }
	    
	    
	
	public void DisplayEmpDetails() {
		System.out.println(EmpName + " " + EmpId + " " + EmpCode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		day2_p2ConstructorDemo obj = new day2_p2ConstructorDemo("Employee001","1267",102);
		obj.DisplayEmpDetails();
		
		System.out.println(obj.EmpName);
		System.out.println(obj.EmpId);
		System.out.println(obj.EmpCode);
			

	}

}
