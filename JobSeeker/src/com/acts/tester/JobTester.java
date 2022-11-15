package com.acts.tester;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

import com.acts.Degree;
import com.acts.JobSeeker;
import com.acts.Utils.DataUtils;
import com.acts.validator.DataValidator;

public class JobTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<JobSeeker> list = new LinkedList<JobSeeker>();
		list = DataUtils.getJobSeekerList();

		int choice;

		String registrantionId;
		String name;
		String email;
		String password;
		String graduationDate;
		LocalDate graduationDate1;
		
		String aadharId;
		String phone;
		String dateOfBirth;
		LocalDate dateOfBirth1;
		do {
			System.out.println("1.Add\n "
					+ "2. Update Email\n"
					+ "3. Display all job seeker by their degree type. (CIVIL,MECHANICAL,IT,CSE)\n"
					+ "4. Sort email.\n"
					+ "5. Sort DOB \n "
					+ "6. Sort GraduationDate\n"
					+ "7. Print all elements.\n"
					+ "0. Exit.\n\n"
					+ "Enter your choice : \n");
			choice = sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter your RegistrantionId : ");
				registrantionId = sc.next();

				System.out.println("Enter your name :");
				name = sc.next();

				System.out.println("Enter your email : ");
				email = sc.next();

				System.out.println("Enter Password : ");
				password = sc.next();

				System.out.println("Enter graduation Date : (YYYY-MM-DD format)");
				graduationDate1 = DataValidator.gradDateValidator(sc.next());

				System.out.println("Enter your AadharId : ");
				aadharId = DataValidator.AadharNumber(sc.next());

				System.out.println("Enter your Phone : ");
				phone = DataValidator.mbNumValidator(sc.next());

				System.out.println("Enter your Degree : ");
				Degree  degree1= Degree.valueOf(sc.next().toUpperCase());

				System.out.println("Enter your date of birth : (YYYY-MM-DD format)");
				dateOfBirth1 =DataValidator.DOBValidator(sc.next());		
				
				JobSeeker x = new JobSeeker(registrantionId, name, email, password, graduationDate1, aadharId, phone, degree1, graduationDate1);

				if(DataValidator.isDuplicateEntry(list,x )) {
					list.add(x);
					System.out.println("Job Profile is added successfully.");
				}
				else
				{
					System.out.println("Duplicate Entry Found.");
				}

//				JobSeeker jobObj = new JobSeeker(registrantionId, name, email, password,graduationDate ,aadharId, phone, degree1, LocalDate.parse(dateOfBirth));
//				list.add(jobObj);
				break;

			case 2:
				System.out.println("Enter a Reg ID to update the mail : ");
				//sc.nextLine();
				String temp = sc.next();
		
				list.forEach((a)-> {
					if(a.getRegistrantionId().equals(temp)) {
						System.err.println("Account Found");
						System.out.println("Enter new mail to update : ");
						String newMail = sc.next();
						a.setEmail(newMail);
						System.out.println("new mail ID successully updated.");
					}
				});

				break;

			case 3:
				System.out.println("Enter a branch which you want to Display : (CIVIL,MECHANICAL,IT,CSE) ");
				String deg = sc.next().toUpperCase();
				list.forEach((a -> {
					if(a.getDegree()==Degree.valueOf(deg)) {
						System.out.println(a.toString());
					}
				})); 

				break;

			case 4:

				Collections.sort(list, new Comparator<JobSeeker>() {

					@Override
					public int compare(JobSeeker j1, JobSeeker j2) {
						return j1.getEmail().compareTo(j2.getEmail());
					}
				});
				break;

			case 5:
				Collections.sort(list, new Comparator<JobSeeker>() {

					@Override
					public int compare(JobSeeker j1, JobSeeker j2) {
						return j1.getDateOfBirth().compareTo(j2.getDateOfBirth());
					}
				});
				break;
			case 6:
				Collections.sort(list, new Comparator<JobSeeker>() {

					@Override
					public int compare(JobSeeker j1, JobSeeker j2) {
						return j1.getGraduationDate().compareTo(j2.getGraduationDate());
					}
				});
				break;

			case 7:
				System.out.println("Here is the list of elements :");
				//				for(JobSeeker x : list) {
				//					System.out.println(x.toString());
				//				};

				list.forEach((a)-> {
					System.out.println(a.toString());
				});

				break;

			case 0:
				sc.close();
				System.exit(0);
			}
		}
		while(choice!=0);
	}
}
