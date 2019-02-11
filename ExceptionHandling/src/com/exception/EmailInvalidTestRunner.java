package com.exception;

public class EmailInvalidTestRunner {
	
	public static void validateEmail(String email) 
			throws EmailInvalidException {
	boolean isValid = email.contains("@");
	if (isValid) {
		System.out.println("Email is Valid ");
	} else
		throw new EmailInvalidException("Invalid Email Id Exception.");
		
	}
	
	
	public static void main(String[] args) 
			throws EmailInvalidException {
		try {
			validateEmail("kbs71190gmail.com");
		} catch(EmailInvalidException ex) {
			ex.printStackTrace();
		}
	}

}
