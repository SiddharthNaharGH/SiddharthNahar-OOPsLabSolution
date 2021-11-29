package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

/**
 * @author Siddharth Nahar
 *
 */
public class Driver {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Please enter your firstname:");
		String firstName = scanner.nextLine();
		
		System.out.println("Please enter your lastname:");
		String lastName = scanner.nextLine();
		
		System.out.println("Please select a department from below list as (1/2/3/4):");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int choice = scanner.nextInt();
		
		Employee employee;
		CredentialService credentials = new CredentialService();
		
		switch(choice){
		
		case 1:
			employee = new Employee(firstName,lastName,"tech");
			break;
		case 2:
			employee = new Employee(firstName,lastName,"adm");
			break;
		case 3:
			employee = new Employee(firstName,lastName,"hr");
			break;
		case 4:
			employee = new Employee(firstName,lastName,"lg");
			break;
		default:
			System.out.println("You have entered an invalid input.");
			return;
		}
		
		credentials.showCredentials(employee);
		
		
	
	}
}
