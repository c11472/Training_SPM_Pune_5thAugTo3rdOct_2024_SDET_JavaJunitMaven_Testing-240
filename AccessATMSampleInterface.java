package com.programs.day3;

public class AccessATMSampleInterface implements ATMSample, BankSampleInterface {

	public void cardNumber() {
		int CardNo=1112;
		System.out.println(CardNo);
		
	}

	public void pinNumber() {
		int PinNum = 1212;
		System.out.println(PinNum);

		
	}


	public void BankName() {
		System.out.println("bank is ICICI - BBSR");
		
	}

}
