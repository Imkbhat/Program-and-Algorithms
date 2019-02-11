package com.exception;

public class TestRunner {

	
	public static void validateException(String phoneNum) 
			throws PhoneNumberException  {
		int phNumLen = phoneNum.length();
		if (phNumLen < 10  || phNumLen > 10) {
			throw new PhoneNumberException("Invalid Phone Number");
		} else {
			System.out.println("Valid Phone Num");
		}
	}
	
	public static void main(String[] args) throws PhoneNumberException {
		try {
			validateException("123456777756");
		} catch(PhoneNumberException px)  {
			px.printStackTrace();
		}
	}

}
