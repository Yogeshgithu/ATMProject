package com.basic.project.Dao;


import java.util.List;

import com.basic.project.entity.AtmCard;
import com.basic.project.entity.Customer;
import com.basic.project.entity.Transaction;

public interface AtmDao {
	
	String deposite(Customer customer,Integer depositeAmount);
	String withdraw(Customer customer,Integer withdrawAmount);

	List<Transaction> miniStatement(Customer customer);
    String Changepin(Customer customer, String newPin);

	 
	Integer checkbalance(Customer customer);
}
	
    
	

