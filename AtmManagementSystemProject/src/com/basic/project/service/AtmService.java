package com.basic.project.service;

import java.util.List;

import com.basic.project.entity.AtmCard;
import com.basic.project.entity.Customer;
import com.basic.project.entity.Transaction;

public interface AtmService {
	
	String deposite(Customer customer,Integer depositeAmount);
	String withdraw(Customer customer,Integer withdrawAmount);
	Integer checkbalance(Customer customer);
	String  changepin(Customer customer, String newPin);
	List<Transaction> miniStatement(Customer customer);

	
	 

}
