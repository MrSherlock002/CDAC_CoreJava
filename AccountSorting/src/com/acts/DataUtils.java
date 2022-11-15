package com.acts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.acts.Bank;
public class DataUtils {
	
	public static List<Bank> getBankList() {
		
		List<Bank> list = new ArrayList<>();
		
		LocalDate validDob1 = ValidationUtils.validateDate("2001-01-01");
		LocalDate validDob2 = ValidationUtils.validateDate("2001-02-01");
		LocalDate validDob3 = ValidationUtils.validateDate("2001-03-01");
		LocalDate validDob4 = ValidationUtils.validateDate("2001-04-01");
		LocalDate validDob5 = ValidationUtils.validateDate("2001-05-01");
		
//		Course validCourse1 = ValidationUtils.getValidCourse("DAC");
//		Course validCourse2 = ValidationUtils.getValidCourse("DESD");
		Address address1 = new Address("Pashan", "Pune", "411007");
		Address address2 = new Address("Pimpri", "Pune", "411061");
		
//		public Bank(String username, String accountNo, String balance, LocalDate dob) 
		
		list.add(new Bank("Ganesh","100","1000", validDob1));
		list.add(new Bank("Prasad","101","2000", validDob2));
		list.add(new Bank("Abhi","102","3000", validDob3));
		list.add(new Bank("Sanket","103","4000", validDob4));
		list.add(new Bank("Aditya","104","5000", validDob5));
		
		return list;
	}
	
public static Bank findByAccNo(List<Bank> list, String accNo) {
		
		for(Bank s : list) {
			if( accNo.equals(s.getAccountNo())) {
				return s;
			}
		}
		return null;
	}

}
