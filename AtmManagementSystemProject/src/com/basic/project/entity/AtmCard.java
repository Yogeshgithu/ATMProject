package com.basic.project.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class AtmCard {
	
	
	@Id
	@Column(length = 16)
	private String cardNo;
	private LocalDate issueDate;
	private LocalDate expiryDate;
    @Column(length = 3)
	private String cvvNo;
	@Column(length = 4)
	private String cardPin;
	@Column(length = 40)
	private String cardType;
	@Column(length = 30)
	private String cardStatus;
	
// 	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="account")
//    private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "accountNo")
	private Account account;

	public String getCardNo() {
		return cardNo;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCvvNo() {
		return cvvNo;
	}

	public void setCvvNo(String cvvNo) {
		this.cvvNo = cvvNo;
	}

	public String getCardPin() {
		return cardPin;
	}

	public void setCardPin(String cardPin) {
		this.cardPin = cardPin;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

}
	