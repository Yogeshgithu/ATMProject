package com.basic.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Account {
	@Id
	@Column(length=20)
	private String accountNo;
	private String accountType;
	private  String accountOpeningDate;
	private String accountStatus;
	private Integer balance;
	
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="customerId")
	private Customer customer;
	
	@OneToMany(mappedBy ="account",cascade=CascadeType.ALL)
	private List<Transaction>transaction;
	
	@OneToOne(mappedBy ="account",cascade = CascadeType.ALL)
	private AtmCard atmCard;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountOpeningDate() {
		return accountOpeningDate;
	}

	public void setAccountOpeningDate(String accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	public AtmCard getAtmCard() {
		return atmCard;
	}

	public void setAtmCard(AtmCard atmCard) {
		this.atmCard = atmCard;
	}
	

}