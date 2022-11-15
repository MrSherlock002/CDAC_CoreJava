package com.acts;

import java.time.LocalDate;
import java.util.Comparator;

public class Bank {
	public String userAccNo;
	public String userName;
	LocalDate dateOfOpening;
	public String userBalance;
	public String totalBankBalance;
	
	public Bank() {
		super();
	}
	
	public Bank(String userAccNo, String userName, String userBalance,LocalDate dateOfOpening) {
		super();
		this.userAccNo = userAccNo;
		this.userName = userName;
		this.dateOfOpening = dateOfOpening;
		this.userBalance = userBalance;
	}
	
	public String getUserAccNo() {
		return userAccNo;
	}
	public void setUserAccNo(String userAccNo) {
		this.userAccNo = userAccNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LocalDate getdateOfOpening() {
		return dateOfOpening;
	}
	public void setdateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	public String getUserBalance() {
		return userBalance;
	}
	public void setUserBalance(String userBalance) {
		this.userBalance = userBalance;
	}
	public String getTotalBankBalance() {
		return totalBankBalance;
	}

	
	@Override
	public String toString() {
		return "Bank [userAccNo=" + userAccNo + ", userName=" + userName + ", dateOfOpening=" + dateOfOpening + ", userBalance="
				+ userBalance + "]"+"\n";
	}
	
}
