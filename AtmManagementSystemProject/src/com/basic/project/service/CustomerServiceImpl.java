package com.basic.project.service;

import com.basic.project.Dao.CustomerDao;
import com.basic.project.Dao.CustomerDaoImpl;
import com.basic.project.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

	
CustomerDao customerDao = new CustomerDaoImpl();
	
  public Customer findcardNo(String cardNo) {
		
		return customerDao.findcardNo(cardNo);
	}
	

}
