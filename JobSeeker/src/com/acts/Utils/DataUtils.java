package com.acts.Utils;

import java.time.LocalDate;
import java.util.LinkedList;

import static com.acts.Degree.MECHANICAL;
import static com.acts.Degree.CIVIL;
import static com.acts.Degree.IT;
import static com.acts.Degree.CSE;

import com.acts.JobSeeker;
import com.acts.JobSeekerExceptions;

public class DataUtils {

	public static LinkedList<JobSeeker> getJobSeekerList(){
		LinkedList<JobSeeker> list = new LinkedList<JobSeeker>();

		LocalDate validDate1 = ValidationUtils.validateDate("2000-10-10");
		LocalDate validDate2 = ValidationUtils.validateDate("2000-04-04");
		LocalDate validDate3 = ValidationUtils.validateDate("2000-02-02");
		LocalDate validDate4 = ValidationUtils.validateDate("2000-01-01");
		
//		JobSeeker(String registrantionId, String name, String email, String password, LocalDate graduationDate,
//				String aadharId, String phone, Degree degree, LocalDate dateOfBirth)

		list.add(new JobSeeker("1","Prasad","prasad@gmail.com", "Pass@123",validDate1 , "1233-5678-1212","1111111111", CSE, validDate4));
		list.add(new JobSeeker("2","Abhi","abhi@gmail.com", "Pass@123",validDate2 , "1233-5678-1212","2222222222", IT, validDate1));
		list.add(new JobSeeker("3","Sanket","Sanket@gmail.com", "Pass@123",validDate3 , "1233-5678-1212","3322114455", MECHANICAL, validDate3));
		list.add(new JobSeeker("4","Aditya","Aditya@gmail.com", "Pass@123",validDate4 , "1233-5678-1212","1234567890", CIVIL, validDate2));
		list.add(new JobSeeker("5","Basavraj","Basavraj@gmail.com", "Pass@123",validDate1 , "1233-5678-1212","1233214567", MECHANICAL, validDate3));
		
		return list;
	}
	public static JobSeeker findByRegID(LinkedList<JobSeeker> list, String tempAccNo) throws JobSeekerExceptions {
		boolean flag = false;
		for(JobSeeker a : list) {
			if(tempAccNo.equals(a.getRegistrantionId())) {
				System.out.println("Account Found.");
				flag = true;
				return a;
			}
		}
		if(!flag) {
			throw new JobSeekerExceptions("Account Not Found..!!");
		}
		return null;
	}

	public static JobSeeker deleteByAccNo(LinkedList<JobSeeker> list, String tempAccNo) throws JobSeekerExceptions {
		for(JobSeeker a : list) {
			if(tempAccNo.equals(a.getRegistrantionId())) {
				System.out.println("Account Found.");
				list.remove(a);
				System.out.println("Account deleted");
				return a;
			}else {
				throw new JobSeekerExceptions("Account Not Found..!!");
			}
		}
		return null;
	}
	
}
