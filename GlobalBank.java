package com.programs.day3;

public class GlobalBank extends BankBase {
	int gbid;
	public void GlobalBankID() {
		//gbid=1001;
		//System.out.println(gbid);
		
		
		
		
		
		
		
	}
	
	public void accessDataFromBase() {
		System.out.println(super.BankName);
	}
	
	public void accessMethodFromBase() {
		super.Display_Details(BankName, BankLoc, IFSCCode);
	}
	
	

}
