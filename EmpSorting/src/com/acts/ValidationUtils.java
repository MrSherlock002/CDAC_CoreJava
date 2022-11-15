package com.acts;

import java.time.LocalDate;

public class ValidationUtils {
	//get enum from String
	public static Engineering getValidEngg(String engg) {
		Engineering enggEnum = null;
		try {
			enggEnum = Engineering.valueOf(engg);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return enggEnum;
	}
	
	public static LocalDate validateDate(String strDate) {
		LocalDate date = LocalDate.parse(strDate);
		
		LocalDate today = LocalDate.now();
		LocalDate requiredDate = today.minusYears(18);
		
		if(date.isBefore(requiredDate)) {
			return date;
		}
		return null;
	}

}
