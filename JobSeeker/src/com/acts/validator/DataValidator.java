package com.acts.validator;

import java.time.LocalDate;
import java.util.LinkedList;

import com.acts.JobSeeker;

public class DataValidator {

	//Graduation Date Validator
	public static LocalDate gradDateValidator(String str) {
		LocalDate gradDate = LocalDate.parse(str);
		LocalDate today = LocalDate.now();
		if(gradDate.isBefore(today)) {
			return gradDate;
		}
		return null;
	}

	//Date of birth Validator
	public static LocalDate DOBValidator(String str) {
		LocalDate dobDate = LocalDate.parse(str);
		LocalDate eligibleAge = LocalDate.now().minusYears(18);
		if(dobDate.isBefore(eligibleAge) || dobDate.isEqual(eligibleAge)) {
			return dobDate;
		}
		return null;
	}

	//Mobile Number Validator
	public static String mbNumValidator(String mobNum) {
		if(mobNum.length()==10){
			for(int i=0; i<mobNum.length(); i++) {
				if(!(mobNum.charAt(i)>=48 && mobNum.charAt(i)<=57)) {
					return null;
				}
			}
			return mobNum;
		}
		return null;
	}
	
	//Aadhar Number Validator
	public static String AadharNumber(String str) {
		if((str.matches("[0-9]+") && str.length()==12)) {
			return str;
		}
		return null;
	}

	public static boolean isDuplicateEntry(LinkedList<JobSeeker> checkList,JobSeeker p) {
		for(int i = 0;i<checkList.size();i++) {
			if(checkList.get(i).getAadharId().equalsIgnoreCase(p.getAadharId())
					||checkList.get(i).getDateOfBirth().equals(p.getDateOfBirth())
					||checkList.get(i).getEmail().equalsIgnoreCase(p.getEmail())
					||checkList.get(i).getGraduationDate().equals(p.getGraduationDate())
					||checkList.get(i).getName().equalsIgnoreCase(p.getName())
					||checkList.get(i).getPhone().contentEquals(p.getPhone())) {
				return false;
			}
		}
		return true;
	}
}
