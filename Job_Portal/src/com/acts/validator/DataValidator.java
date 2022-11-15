package com.acts.validator;

import java.time.LocalDate;
import java.util.LinkedList;

import com.acts.jobportal.JobProfile;

public class DataValidator {

	//Graduation date validator
	public static LocalDate gradDateValidator(String str) {
		LocalDate gradDate =LocalDate.parse(str);
		LocalDate today = LocalDate.now();
		if(gradDate.isBefore(today)) {
			return gradDate;
		}
		return null;
	}
	//date of birth validator
	public static LocalDate dateOfBirthValidator(String str) {
		LocalDate dobDate =LocalDate.parse(str);
		LocalDate eligibleAge = LocalDate.now().minusYears(18);
		if(dobDate.isBefore(eligibleAge)||dobDate.isEqual(eligibleAge)) {
			return dobDate;
		}
		return null;
	}

	//Mobile Number Validator
	public static String mobNoValidate(String mobNum) {
		for(int i =0 ;i<mobNum.length();i++) {
			if(!(mobNum.charAt(i)>=48 &&mobNum.charAt(i)<=57)) {
				return null;
			}
		}
		return mobNum;	
	}

	public static boolean isDuplicateEntry(LinkedList<JobProfile> checkList,JobProfile p) {
		for(int i = 0;i<checkList.size();i++) {
			if(checkList.get(i).getAadharId().equalsIgnoreCase(p.getAadharId())
					||checkList.get(i).getDateOfBirth().equals(p.getDateOfBirth())
					||checkList.get(i).getEmail().equalsIgnoreCase(p.getEmail())
					||checkList.get(i).getGraduationDate().equals(p.getGraduationDate())
					||checkList.get(i).getName().equalsIgnoreCase(p.getName())
					||checkList.get(i).getPhoneNumber().contentEquals(p.getPhoneNumber())) {
				return false;
			}
		}
		return true;
	}
}
