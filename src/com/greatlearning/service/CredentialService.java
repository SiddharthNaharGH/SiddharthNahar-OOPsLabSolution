package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

/**
 * @author Siddharth Nahar
 *
 */
public class CredentialService {

	public String generateEmailAddress(Employee employee)
	{
		// Generate email address
		
		String email = employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+"@"+employee.getDepartment()+".abc.com";
		
		return email;
	}
	
	public String generatePassword()
	{
		// Generate 8 digit random password
		
		String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerChars = "abcdefghijklmnopqrstuvwxyz";
		String numerals = "0123456789";
		String specialChars = "!@#$%^&*_=+-/.?<>";
		
		String allowedChars = upperChars+lowerChars+numerals+specialChars;

		Random random = new Random();
		
		char[] password = new char[8];
		
		for(int i = 0;i<8;i++) {
			
				int idx = random.nextInt(allowedChars.length());
				password[i] = allowedChars.charAt(idx);
			
		}
			
		
		return String.valueOf(password);

	}
	
	
	public void showCredentials(Employee employee)
	{
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows:");
		System.out.println("Email --->"+generateEmailAddress(employee));
		System.out.println("Password --->"+generatePassword());
	}
}