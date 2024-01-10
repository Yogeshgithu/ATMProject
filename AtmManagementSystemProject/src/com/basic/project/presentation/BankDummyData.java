package com.basic.project.presentation;


	import java.time.LocalDate;
	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	import com.basic.project.entity.Account;
	import com.basic.project.entity.AtmCard;
	import com.basic.project.entity.Bank;
	import com.basic.project.entity.Customer;

	public class BankDummyData {

		public static void main(String[] args) 
		{
			Bank bank1 =new Bank();
			Bank bank2 =new Bank();
			
			
			Customer customer1 = new Customer();
			Customer customer2 = new Customer();
			Customer customer3 = new Customer();
			Customer customer4 = new Customer();
			
			
			
			AtmCard atmCard1 = new AtmCard();
			AtmCard atmCard2 = new AtmCard();
			AtmCard atmCard3 = new AtmCard();
			AtmCard atmCard4 = new AtmCard();
			
			
			
			Account account1 = new Account();
			Account account2 = new Account();
			Account account3 = new Account();
			Account account4 = new Account();
			
			
			  List<AtmCard> listCard1=List.of(atmCard1,atmCard2);
			  List<AtmCard> listCard2=List.of(atmCard3,atmCard4);
			
			
			List<Account> listAccount1 =List.of(account1,account2);
			List<Account> listAccount2 =List.of(account3,account4);
			//List<Account> listAccount3 =List.of(account5);
			//List<Account> listAccount4 =List.of(account6,account7);
			
			List<Customer> cust =List.of(customer1);
			List<Customer> cust1 =List.of(customer2);
			//List<Customer> cust2 =List.of(customer5);
			//List<Customer> cust3 =List.of(customer6,customer7);
			
			///bank1.setIfsccode("BKID000086");
			//bank1.setBankName("BKID");
			//bank1.setBranchCode("000086");
			//bank1.setCustomer(cust);
			
			bank2.setIfscCode("MAHB0001425");
			bank2.setBankName("MAHB");
			bank2.setBranchCode("001425");
			bank2.setCustomer(cust1);
			
			//bank3.setIfsccode("UBIN0577669");
			//bank3.setBankName("UBIN");
			//bank3.setBranchCode("577669");
			//bank3.setCustomer(cust2);
			
			bank1.setIfscCode("BIN0040288");
			bank1.setBankName("SBI");
			bank1.setBranchCode("018696");
			bank1.setCustomer(cust);
			
			
			customer1.setCustomerId(182809806);
			customer1.setCustomerName("MonaliPhase");
			customer1.setAddharNumber("834151700939");
			customer1.setAddress( "Akola");
			customer1.setCustomerContact("9067802264");
			customer1.setDateOfBirth("04-07-2001");
			customer1.setEmailId("monali@gmail.com");
			customer1.setGender('F');
			customer1.setPanNumber("CCGPN2602H");
			customer1.setAccounts(listAccount1);;
			customer1.setBank(bank1);
			
			customer2.setCustomerId(123454788);
			customer2.setCustomerName("ArpitaLondhe");
			customer2.setAddharNumber("966717795864");
			customer2.setAddress( " wagholi pune");
			customer2.setCustomerContact("9096994272");
			customer2.setDateOfBirth("11-06-2001");
			customer2.setEmailId("arpita07@gmail.com");
			customer2.setGender('F');
			customer2.setPanNumber("BKCPL6638Q");
			customer2.setAccounts(listAccount1);
			customer2.setBank(bank1);
			
			customer3.setCustomerId(95222869);
			customer3.setCustomerName("Aishwarya");
			customer3.setAddharNumber("321259914060");
			customer3.setAddress( "Latur");
			customer3.setCustomerContact("7218491761");
			customer3.setDateOfBirth("23-08-2001");
			customer3.setEmailId("aishwarya@gmail.com");
			customer3.setGender('F');
			customer3.setPanNumber("GPRPP7147R");
			customer3.setAccounts(listAccount1);
			customer3.setBank(bank1);
		
			customer4.setCustomerId(123454799);
			customer4.setCustomerName("Sushmita");
			customer4.setAddharNumber("966717795850");
			customer4.setAddress("Ausa");
			customer4.setCustomerContact("8669731649");
			customer4.setDateOfBirth("25-03-2003");
			customer4.setEmailId("sushmita@gmail.com");
			customer4.setGender('F');
			customer4.setPanNumber("BLMDA2204P");
			customer4.setAccounts(listAccount1);
			customer4.setBank(bank1);
			
			
		
			
			atmCard1.setCardNo("6960989749656251");
			atmCard1.setCardPin("3110");
			atmCard1.setCardStatus("Active");
			atmCard1.setCardType("Atm Card");
			atmCard1.setCvvNo("084");
			atmCard1.setIssueDate(LocalDate.now());
	        atmCard1.setExpiryDate(LocalDate.of(2025,05,30));
	        atmCard1.setAccount(account1);
	        
	        atmCard2.setCardNo("6522290048608445");
			atmCard2.setCardPin("1234");
			atmCard2.setCardStatus("Active");
			atmCard2.setCardType("Debit Card");
			atmCard2.setCvvNo("821");
			atmCard2.setIssueDate(LocalDate.now());
	        atmCard2.setExpiryDate(LocalDate.of(2026,02,28));
	        atmCard2.setAccount(account2);
	        
	        
	        atmCard3.setCardNo("6960989749656261");
			atmCard3.setCardPin("2758");
			atmCard3.setCardStatus("Active");
			atmCard3.setCardType("Atm Card");
			atmCard3.setCvvNo("085");
			atmCard3.setIssueDate(LocalDate.now());
	        atmCard3.setExpiryDate(LocalDate.of(2026,05,30));
	        atmCard3.setAccount(account3);
	        
	        
	        atmCard4.setCardNo("6522290048608455");
			atmCard4.setCardPin("1234");
			atmCard4.setCardStatus("Active");
			atmCard4.setCardType("Debit Card");
			atmCard4.setCvvNo("832");
			atmCard4.setIssueDate(LocalDate.now());
	        atmCard4.setExpiryDate(LocalDate.of(2027,02,23));
	        atmCard4.setAccount(account4);
	     
	        account1.setAccountNo("69218110086");
	        account1.setAccountOpeningDate(LocalDate.now().toString());
	        account1.setAccountStatus("Active");
	        account1.setAccountType("Saving");
	        account1.setBalance(15000);
	        account1.setCustomer(customer1);
	        account1.setTransaction(null);
	        account1.setAtmCard(atmCard1);;
	        
	        account2.setAccountNo("60124348439");
	        account2.setAccountOpeningDate(LocalDate.now().toString());
	        account2.setAccountStatus("Active");
	        account2.setAccountType("Current");
	        account2.setBalance(18000);
	        account2.setCustomer(customer2);
	        account2.setTransaction(null);
	        account2.setAtmCard(atmCard2);
	        
	        account3.setAccountNo("1831104000044022");
	        account3.setAccountOpeningDate(LocalDate.now().toString());
	        account3.setAccountStatus("Active");
	        account3.setAccountType("Saving");
	        account3.setBalance(11000);
	        account3.setCustomer(customer3);
	        account3.setTransaction(null);
	        account3.setAtmCard(atmCard3);
	        
	        account4.setAccountNo("60124348449");
	        account4.setAccountOpeningDate(LocalDate.now().toString());
	        account4.setAccountStatus("Active");
	        account4.setAccountType("current");
	        account4.setBalance(8000);
	        account4.setCustomer(customer4);
	        account4.setTransaction(null);
	        account4.setAtmCard(atmCard4);
	        
	       
	        
	        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raj");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
	        EntityTransaction entityTransaction= entityManager.getTransaction();
	        
	        
	        entityTransaction.begin();
	             entityManager.persist(bank1);
	             entityManager.persist(bank2);
	       entityTransaction.commit();      
	             
	        
	       System.out. println("Save Object");
	       
	       entityManagerFactory.close();
	       entityManager.close();
	        
	        
			
			
		}

	}
	


