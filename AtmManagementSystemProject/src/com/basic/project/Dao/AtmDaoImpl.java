package com.basic.project.Dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.boot.spi.InFlightMetadataCollector.EntityTableXref;

import com.basic.project.entity.Account;
import com.basic.project.entity.AtmCard;
import com.basic.project.entity.Customer;
import com.basic.project.entity.Transaction;

public class AtmDaoImpl implements AtmDao {
	 EntityManager entityManager = MyConnection.getEntityManagerObject();
	 EntityTransaction entityTransaction = entityManager.getTransaction();
	 
	 
	
	
	@Override
	public String deposite(Customer customer, Integer depositeAmount) {
		Transaction transaction = new Transaction();
		Account account = customer.getAccounts().get(0);
		entityTransaction.begin();
		customer.getAccounts().get(0).setBalance(customer.getAccounts().get(0).getBalance()+depositeAmount);
		transaction.setAccount(account);
		transaction.setTransactionDate(LocalDate.now());
		transaction.setTransactionTime(LocalTime.now());
		transaction.setTransactionAmount(depositeAmount);
		transaction.setTransactionType("Cr");
		entityManager.persist(transaction);
		entityTransaction.commit();
		
		return"Deposited successfully..\n";
	}
		
	


	@Override
	public String withdraw(Customer customer, Integer withdrawAmount) {
		
		Transaction transaction = new Transaction();
		Account account = customer.getAccounts().get(0);
		entityTransaction.begin();
		customer.getAccounts().get(0).setBalance(customer.getAccounts().get(0).getBalance()+withdrawAmount);
		transaction.setAccount(account);
		transaction.setTransactionDate(LocalDate.now());
		transaction.setTransactionTime(LocalTime.now());
		transaction.setTransactionAmount(withdrawAmount);
		transaction.setTransactionType("Dr");
		entityManager.persist(transaction);
		entityTransaction.commit();
		
		return "Ammount withdraw Successfully";
	}
 @Override
 public  List<Transaction>miniStatement(Customer customer){
	 Account account = customer.getAccounts().get(0);
	 
	 List<Transaction>trans=null;
	 if(account!=null)
	 {
		 String jpql="select t from Transaction t";
				 Query ql=entityManager.createQuery(jpql);
		         trans=ql.getResultList();
	 }
	 return trans;
 }




@Override
public String Changepin(Customer customer, 	String  newPin) {
	entityTransaction.begin();
	customer.getAccounts().get(0).getAtmCard().setCardPin(newPin);
	
	entityTransaction.commit();
	return null;
}

@Override
public Integer checkbalance(Customer customer) {
	
	Account account = customer.getAccounts().get(0);
	return  customer.getAccounts().get(0).getBalance();
}
 



	
	
		
	}


		
	








	






