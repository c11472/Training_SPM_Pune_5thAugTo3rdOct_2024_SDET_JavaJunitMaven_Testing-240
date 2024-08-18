package com.programs.day3;

public class BankBase {
	String BankName;
	String BankLoc;
	String IFSCCode;
	
	BankBase(){
		BankName="ICICI";
		BankLoc="NCR-P1";
		IFSCCode="121212";
	}
	
	public void Display_Details(String bnm, String loc , String code) {
		this.BankName=bnm;
		this.BankLoc=loc;
		this.IFSCCode=code;
		System.out.println(BankName + " " + BankLoc + " "+ IFSCCode);
	}
	
}
