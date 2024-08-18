package com.programs.day3;

 class OrderDetails {
	
	int orderID;
	String orderCode;
	String assigned_vendor;
	
	// constructor
	
	public OrderDetails(int oid , String oc , String av) {
		this.orderID=oid;
		this.orderCode=oc;
		this.assigned_vendor=av;
		
	}
	
	public void DiaplayOrderId() {
		System.out.println(orderID);
	}
	
	public void DisplayOrderCode() {
		System.out.println(orderCode);
	}
	
	public void DisplayAssignedVendor() {
		System.out.println(assigned_vendor);
	}
	
	

} // end Base


class Customer_Ord extends  OrderDetails{

	public Customer_Ord(int oid, String oc, String av) {
		super(oid, oc, av);
		// TODO Auto-generated constructor stub
	}
	
	// access the methods
	// create an object and call the methods
	
}



class MainTest {
	public static void main(String args[]) {
		
		// Create object for derived class
		
		Customer_Ord obj = new Customer_Ord(1111,"c0178", "Testvendor");
		
		obj.DiaplayOrderId();
		obj.DisplayAssignedVendor();
		obj.DisplayOrderCode();
		
	}
}
