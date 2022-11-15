package com.acts.containers.tester;

import java.time.LocalDate;

import com.acts.ValidationUtils;

public class LocalDateTester {

	public static void main(String[] args) {
		LocalDate today =  LocalDate.now();
		today = today.minusYears(21);
		System.out.println(today);
		
		LocalDate dob = LocalDate.parse("2022-10-05");
		System.out.println(dob.toString());
		String strDate = "2022-10-05";
		LocalDate d = ValidationUtils.validateDob(strDate);
		if(null == d) {
			System.out.println("invalid DOB");
		}
		System.out.println(d);
		

	}

}
