package com.acts;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
public class BankUtils {
	public static LinkedList<Bank> getBankList(){
		LinkedList<Bank> list = new LinkedList<Bank>();

		LocalDate validDate1 = ValidationUtils.validateDate("2000-10-10");
		LocalDate validDate2 = ValidationUtils.validateDate("2000-04-04");
		LocalDate validDate3 = ValidationUtils.validateDate("2000-02-02");
		LocalDate validDate4 = ValidationUtils.validateDate("2000-01-01");

		list.add(new Bank("2", "Prasad", "1000",validDate1));
		list.add(new Bank("1", "Abhi", "2000",validDate2));
		list.add(new Bank("3", "Sanket", "3000",validDate3));
		list.add(new Bank("5", "Aditya", "4000",validDate3));
		list.add(new Bank("4", "Basavraj", "5000", validDate4));
		return list;
	}
	public static Bank findByAccNo(LinkedList<Bank> list, String tempAccNo) throws BankExceptions {
		boolean flag = false;
		for(Bank a : list) {
			if(tempAccNo.equals(a.getUserAccNo())) {
				System.out.println("Account Found.");
				flag = true;
				return a;
			}
		}
		if(!flag) {
			throw new BankExceptions("Account Not Found..!!");
		}
		return null;
	}

	public static Bank deleteByAccNo(LinkedList<Bank> list, String tempAccNo) throws BankExceptions {
		for(Bank a : list) {
			if(tempAccNo.equals(a.getUserAccNo())) {
				System.out.println("Account Found.");
				list.remove(a);
				System.out.println("Account deleted");
				return a;
			}else {
				throw new BankExceptions("Account Not Found..!!");
			}
		}
		return null;
	}
}
