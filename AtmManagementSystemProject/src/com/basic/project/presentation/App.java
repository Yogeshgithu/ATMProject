package com.basic.project.presentation;

import com.basic.project.entity.Customer;

public interface App {
	
	void deposite(Customer customer);
	void withdraw(Customer customer);
	
	void checkBalance(Customer customer);
	void miniStatement( Customer customer);
	void changePin(Customer customer);
	
}
