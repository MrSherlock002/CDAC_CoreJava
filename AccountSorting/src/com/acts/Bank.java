package com.acts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank implements Comparable<Bank> {
	
	public static final String EMPTY_STRING = "";
	
	private String username;
	private String accountNo;
	private String balance;
	private LocalDate todaydate;
	private static double totalAmount;
	

	//Student has Addresses one to many Aggregation/Assocaiation
	//Egar init
	//private List<Address> addressList = new ArrayList<Address>();
	
	public Bank() {
		super();
	}	
	private List<Address> addressList;
	public Bank(String username, String accountNo, String balance, LocalDate date) {
		super();
		this.username = username;
		this.accountNo = accountNo;
		this.balance = balance;
		this.todaydate = date;
		int i=Integer.parseInt(balance);  
		this.totalAmount += i;
		this.addressList = addressList;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public static String getEmptyString() {
		return EMPTY_STRING;
	}

	public LocalDate getTodayDate() {
		return todaydate;
	}

	public void getTodayDate(LocalDate date) {
		this.todaydate = date;
	}

	public List<Address> getAddresses() {
		return addressList;
	}
	
	
	
	/////////////////////////////////////////////////////////////////

	public void addAddress(Address address) {
		if(null == addressList) {
			//Lazy creattion of List
			this.addressList = new ArrayList<Address>();
		}
		this.addressList.add(address);
	}

	
	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", balance=" + balance + ", username="
				+ username + ", date=" + todaydate + ", addressList=" + addressList + "]";
	}

	
	@Override
	public int compareTo(Bank o) {
		return this.accountNo.compareTo(o.accountNo); // ASC
		//return o.accountNo.compareTo(this.accountNo); // DSC
	}
	
	  //Student to Object if we pass student
	  
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals called");
		if( obj instanceof Bank) {
			Bank other = (Bank) obj;
			return this.getAccountNo() == other.getAccountNo();
		} 
		return false;
	}
}
