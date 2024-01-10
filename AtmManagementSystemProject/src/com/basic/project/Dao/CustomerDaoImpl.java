package com.basic.project.Dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.basic.project.entity.Account;
import com.basic.project.entity.AtmCard;
import com.basic.project.entity.Customer;

public class CustomerDaoImpl implements  CustomerDao {
	EntityManager entityManager = MyConnection.getEntityManagerObject();

	@Override
	public Customer findcardNo(String cardNo) {
		Customer cust=null;
		Account account1 = null;
		String jpql="select a from Account a";
		Query query = entityManager.createQuery(jpql);
		List<Account> l=query.getResultList();
		for (Account account :l) 
		{
		AtmCard atmCard = account.getAtmCard();
		if (atmCard.getCardNo().equals(cardNo)) {
			
		account1=atmCard.getAccount();
		System.out.println(atmCard.getCardNo());
		cust=account1.getCustomer();
		break;
		}
		
			
		}
		if(cust!=null) {
			cust = entityManager.find(Customer.class,cust.getCustomerId());
			
				
			}
		return cust;
		}
	}
	

