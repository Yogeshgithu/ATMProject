package com.basic.project.presentation;

import java.util.Scanner;

import com.basic.project.entity.Customer;
import com.basic.project.service.CustomerService;
import com.basic.project.service.CustomerServiceImpl;

public class Login {
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String cardNo;
		
		while(true)
		{
			System.out.println("Enter the card number:");
			 cardNo =scanner.next();
			 if(isValidationCardNumber(cardNo)) {
				 break;
			 }
			 else {
				 System.out.println("Invalid card number.please enter again");
				 
			 }
		}
		
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer = customerService.findcardNo(cardNo);
		
		if(customer!=null)
		
		{
			int  maxAttempts=3;
			int attempts =0;
			while (attempts <maxAttempts) {
				System.out.println("Enter the Pin no:");
			    String pinNo = scanner.next();
			    
			  if(!pinNo.matches("\\d{4}")) {
				  System.out.println("pin should be exactliy 4 digit.please enter a valid Pin");
			  }
			  else {
			
			if(pinNo.equals(customer.getAccounts().get(0).getAtmCard().getCardPin()))
					{
				MainApp.displayMenu(customer);;
				break;
					}
			else
			{
				attempts++;
			}
				System.out.println("Incorrect pin.Attempt left"+(maxAttempts-attempts));
				
				if(attempts<maxAttempts)
				{
					System.out.println("Please try again..");
				}
					}
		}
			if(attempts==maxAttempts)
			{
					System.out.println("Exceeded maximum login attempts.card blocked.please contact customer support.");
			}
		}
		else {
			System.out.println("Card Not Found");
		}

	
       scanner.close();
		}

	private static boolean isValidationCardNumber(String cardNo) {
		if(!cardNo.matches("\\d+"))
		{
			System.out.println("Card number can only contain digits");
			return false;
		}
		if(cardNo.length()!=16) {
			System.out.println("card no must be 16 digit");
			return false;
		}
		return true;
	}

}

