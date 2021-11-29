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
			if(i==0)
			{
				int idx = random.nextInt(upperChars.length());
				password[i] =upperChars.charAt(idx);
			}
			else if(i==1)
			{
				int idx = random.nextInt(lowerChars.length());
				password[i] =lowerChars.charAt(idx);
			}
			else if(i==2)
			{
				int idx = random.nextInt(numerals.length());
				password[i] =lowerChars.charAt(idx);
			}
			else if(i==3)
			{	
				int idx = random.nextInt(allowedChars.length());
				password[i] = allowedChars.charAt(idx);
			}
			else
			{
				int idx = random.nextInt(allowedChars.length());
				password[i] = allowedChars.charAt(idx);
			}
		}
			
		
		return password.toString();

	}
	
	
	public void showCredentials(Employee employee)
	{
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows:");
		System.out.println("Email --->"+generateEmailAddress(employee));
		System.out.println("Password --->"+generatePassword());
	}
}