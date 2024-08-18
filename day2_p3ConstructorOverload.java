/*****
 * This code demonstrates the feature of overloading 
 * the constructor in Java
 * 
 * 
 */
package com.programs.day2;

public class day2_p3ConstructorOverload {
	
	  String CarName;
	  String OwenerName;
	  String CarColor;
	  
	  
	  //const1
	  
	  public day2_p3ConstructorOverload() {
		  this.CarName="BMW";
		  this.OwenerName="Owner1";
		  this.CarColor="Green";
	  }
	  
	  
	  public day2_p3ConstructorOverload(String Cname, String ON , String Ccol) {
		  this.CarName=Cname;
		  this.OwenerName=ON;
		  this.CarColor=Ccol;
	  }
	  
	  public day2_p3ConstructorOverload(String Cname1, String ON1 , String Ccol1,String data) {
		  this.CarName=Cname1;
		  this.OwenerName=ON1;
		  this.CarColor=Ccol1;
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day2_p3ConstructorOverload obj = new day2_p3ConstructorOverload();
		System.out.println(obj.CarName + " " +obj.OwenerName + " " + obj.CarColor);
		
		
		day2_p3ConstructorOverload obj2 = new day2_p3ConstructorOverload("Indica","Owner2","Red");
		
		System.out.println(obj2.CarName + " " +obj2.OwenerName + " "+ obj2.CarColor);
		
		day2_p3ConstructorOverload obj3 = new day2_p3ConstructorOverload("testcar","owner3","Blue","1111");
		System.out.println(obj3.CarName + " " + obj3.OwenerName+ " "+ obj3.CarColor);
		

	}

}
