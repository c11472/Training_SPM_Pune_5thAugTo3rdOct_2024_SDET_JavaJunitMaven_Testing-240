package com.programs.day2;

class BaseB {
	
	int Eid;
	String Ename;
	
	public void Edeails(int id , String nm) {
		this.Eid=id;
		this.Ename=nm;
		System.out.println(Eid +" " + Ename);
		
	}

}

class BaseA extends BaseB{
	public static void main(String args[]) {
		
		BaseA obj = new BaseA();
		obj.Edeails(1010, "11472");
		
	}
}
