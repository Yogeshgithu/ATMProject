
package com.basic.project.service;

import java.util.List;

import com.basic.project.Dao.AtmDao;
import com.basic.project.Dao.AtmDaoImpl;
import com.basic.project.entity.Account;
import com.basic.project.entity.Customer;
import com.basic.project.entity.Transaction;

;
//@Service
public class AtmServiceImpl implements AtmService{
	 AtmDao  atmDao= new AtmDaoImpl();

	@Override
	public String deposite(Customer customer, Integer depositeAmount) {
		atmDao.deposite(customer, depositeAmount);
		
		return "Amount deposite Successfully";
	}

	@Override
	public String withdraw(Customer customer, Integer withdrawAmount) {
		atmDao.withdraw(customer, withdrawAmount);
		return "Amount withdraw Successfully";
	}

	@Override
	public  Integer checkbalance(Customer customer) {
		return atmDao.checkbalance(customer);
	}

	@Override
	public String changepin(Customer customer, String newPin) {
		atmDao.Changepin(customer, newPin);
		return "Pin change Successfully";
	}

	@Override
	public List<Transaction> miniStatement(Customer customer) {
		
		return atmDao.miniStatement(customer);
	}
	
	
	
	
	
     
	
	

		
	}

	
	
       
        
	
	
	
	

   
            
        
    
	
	
	




