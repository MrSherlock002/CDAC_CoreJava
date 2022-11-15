package com.acts.Utils;

import java.time.LocalDate;

public class ValidationUtils {

	public static LocalDate validateDate(String strDate) {
		LocalDate date = LocalDate.parse(strDate);

		if(date.isBefore(LocalDate.now())) {
			return date;
		}
		else {
			System.out.println("Enter a valid date.");
		}
		return null;
	}
}
