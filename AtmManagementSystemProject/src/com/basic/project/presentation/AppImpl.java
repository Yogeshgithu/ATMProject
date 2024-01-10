package com.basic.project.presentation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.basic.project.entity.Customer;
import com.basic.project.entity.Transaction;
import com.basic.project.service.AtmService;
import com.basic.project.service.AtmServiceImpl;



	public class AppImpl implements App {
		
		Scanner scanner= new Scanner(System.in);
		AtmService atmService= new AtmServiceImpl();

		@Override
		public void deposite(Customer customer) {
			while(true) {
				
			
			System.out.println("Enter the amount:");
			Integer depositeAmount= scanner.nextInt();
			
			if(depositeAmount<0) {
				System.out.println("Deposite amount should be positive");
			}
			else if(depositeAmount<100 || depositeAmount>10000) {
				System.out.println("Amount should be between 100 and 10000. Please enter a valid amount.");
			}
			else {
				String result= atmService.deposite(customer, depositeAmount);
				System.out.println(result);
				
				
				 if (result.equals("Deposite successfully")) 
			        {
			            break;
			        }
			        break;
				
			}
			}
			
			
		}

		@Override
		public void withdraw(Customer customer) {
			while (true) 
			{
			    System.out.println("Enter the amount:");
			    Integer withdrawAmount = scanner.nextInt();

			    if (withdrawAmount < 0) {
			        System.out.println("Withdraw amount should be positive");
			    } 
			    else if (withdrawAmount < 100 || withdrawAmount > 10000) {
			        System.out.println("Amount should be between 100 and 10000. Please enter a valid amount.");
			    } 
			    else 
			    {  
			    	double currentBalance = customer.getAccounts().get(0).getBalance();
			        if (withdrawAmount > currentBalance) {
			            System.out.println("Insufficient balance. Your current balance is: " + currentBalance);
			        }else {
			        	
			        
			        
			        String result = atmService.withdraw(customer, withdrawAmount);
			        System.out.println(result);

			        // Exit the loop if the withdrawal was successful
			        if (result.equals("Withdrawal successfully")) 
			        {
			            break;
			        }
			        break;
			    }
			}
			}

		}

	
	
	
		@Override
		public void changePin(Customer customer) {
			System.out.println("Enter the old PIN:");
		    String oldPin = scanner.next();

		    // Assume oldPin is retrieved from the customer object
		    String storedPin = customer.getAccounts().get(0).getAtmCard().getCardPin();

		    if (!oldPin.equals(storedPin)) {
		        System.out.println("Old PIN is incorrect. Please enter the correct old PIN.");
		    } else {
		        System.out.println("Enter the new PIN:");
		        String newPin = scanner.next();
		        System.out.println("Confirm the new PIN:");
		        String confirmPin = scanner.next();

		        if (!newPin.matches("\\d{4}")) {
		            System.out.println("New PIN should be exactly 4 digits. Please enter a valid new PIN.");
		        } else if (newPin.equals(oldPin)) {
		            System.out.println("New PIN cannot be the same as the old PIN. Please enter a different new PIN.");
		        } else if (!newPin.equals(confirmPin)) {
		            System.out.println("New PIN and confirm PIN do not match. Please try again.");
		        } else {
		            // Update the PIN with the new PIN
		            customer.getAccounts().get(0).getAtmCard().setCardPin(newPin);
		            System.out.println(atmService.changepin(customer, newPin));
		        }
		    }
			
		}

	
		
			

	@Override
	public void miniStatement(Customer customer) {

		List<Transaction> l=atmService.miniStatement(customer);
		 Iterator<Transaction>  itr= l.iterator();
	 
	 System.out.println("---------------------------------------------------------------------------------------------------------------------");
	 System.out.println(            "transactionId   trasactiontype  transactionAmount  trnsactionDate   transactionTime");
 System.out.println("----------------------------------------------------------------------------------------------------------------");

 
 while(itr.hasNext())
 {
		 Transaction t= itr.next();
	 System.out.println(t.getTransactionId()+"\t"+"\t"+t.getTransactionType()+"\t"+"\t"+t.getTransactionAmount()+"\t"+"\t"+t.getTransactionDate()+"\t"+"\t"+t.getTransactionTime());
 }
		
	}

	@Override
	public void checkBalance(Customer customer) {
		System.out.println("Your Account balance is :"+atmService.checkbalance(customer));
		
	}
		}

		
	
