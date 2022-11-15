package com.acts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataUtils {
	
	public static List<Emp> getEmpList() {
		
		List<Emp> list = new ArrayList<>();
		
		LocalDate validDate1 = ValidationUtils.validateDate("2001-01-01");
		LocalDate validDate2 = ValidationUtils.validateDate("2002-02-02");
		LocalDate validDate3 = ValidationUtils.validateDate("2003-03-03");
		LocalDate validDate4 = ValidationUtils.validateDate("2004-04-04");
		LocalDate validDate5 = ValidationUtils.validateDate("2005-05-05");
		
		Engineering validEngg1 = ValidationUtils.getValidEngg("COMPUTER");
		Engineering validEngg2 = ValidationUtils.getValidEngg("ELECTRICAL");
		Engineering validEngg3 = ValidationUtils.getValidEngg("MECHANICAL");
		Engineering validEngg4 = ValidationUtils.getValidEngg("CIVIL");
		Engineering validEngg5 = ValidationUtils.getValidEngg("IT");
		
		Address address1 = new Address("Pashan", "Pune", "411007");
		Address address2 = new Address("Pimpri", "Pune", "411061");
		
//		Emp(Integer empId, String empName, Engineering engg, LocalDate date)
		list.add(new Emp(100, "Prasad",validEngg1,validDate1));
		list.add(new Emp(101, "Abhi",validEngg2,validDate2 ));
		list.add(new Emp(102, "Sanket",validEngg3,validDate3 ));
		list.add(new Emp(103, "Aditya",validEngg4,validDate4));
		list.add(new Emp(104, "Monika",validEngg5,validDate5 ));
		return list;
	}
	
public static Emp findByEmpId(List<Emp> list, Integer empId) {
		
		for(Emp s : list) {
			if( empId.equals(s.getEmpId())) {
				return s;
			}
		}
		return null;
	}
}
