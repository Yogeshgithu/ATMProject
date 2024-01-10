package com.basic.project.presentation;

import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder.Case;

import com.basic.project.entity.Customer;

public class MainApp {
	
	public static  void displayMenu(Customer customer)
	
	{
		int ch;
		System.out.println("            ************************************************************");
		System.out.println("                                 Well-Come To ATM System                 ");
		System.out.println("            ************************************************************");
		
		System.out.println("/n                       Welcome  "+customer.getCustomerName()+"                  Account Number "+customer.getAccounts()+"/n");
		Scanner sc=new Scanner(System.in);
		App app = new AppImpl();
		
		int op=0;
		do {
			System.out.println("1.Deposite");
			System.out.println("2.Withdraw");
			System.out.println("3.Mini Statement");
			System.out.println("4.Change Pin");
			System.out.println("5.Check Balance");
			System.out.println("6.EXIT.../n");
			System.out.println("Enter your choice::");
			
			 ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				app.deposite(customer);
				break;
				
		case 2:
			app.withdraw(customer);
			break;
		
		case 3:
			app.miniStatement(customer);
			break;
		case 4:
			app.changePin(customer);
			break;
			
		case 5:
			app.checkBalance(customer);
			break;
			
		case 6:
			System.out.println("-----------------------------------Exit--------------------------------------");
		  	System.exit(0);
		  	break;
		  	
		  default:
			  System.out.println("PLEASE ENTER CORRECT OPTION..");
			  break;
			}
		}
		while(ch!=6);
		sc.close();
	}
}
			


