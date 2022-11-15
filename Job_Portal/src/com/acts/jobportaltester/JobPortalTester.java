package com.acts.jobportaltester;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

import com.acts.degree.Degree;
import com.acts.jobportal.JobProfile;
import com.acts.validator.DataValidator;

public class JobPortalTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList<JobProfile> jobProfileList = new LinkedList<>();

		int choice  = 0;
		do {

			System.err.println("\n Enter the Option ");
			System.out.println("1.JobSeeker registration ");
			System.out.println("2.Update email ");
			System.out.println("3.Job seeker by their degree type");
			System.out.println("4.Sort JobSeeker details as per email");
			System.out.println("5.Sort JobSeeker details as per dob ");
			System.out.println("6.Sort customer details  as per graduationDate");
			System.out.println("7.Display All Applicants");
			System.out.println("0.Exit ");

			choice = sc.nextInt();

			switch(choice) {

			case 1:{

				//JobSeeker registration
				String eater =sc.nextLine();
				System.out.println("Enter the Name");
				String jobSeekerName = sc.nextLine();

				System.out.println("Enter the Email");
				String jobSeekerEmail = sc.nextLine();

				System.out.println("Enter the Password");
				String jobSeekerPassword = sc.nextLine();

				System.out.println("Enter the Date Of Birth in YYYY-MM-DD format");
				LocalDate jobSeekerDOB = DataValidator.dateOfBirthValidator(sc.nextLine());
				String eater1 =sc.nextLine();
				System.out.println("Enter the 12 digit Addhar ID");
				String jobSeekerAddharID = DataValidator.mobNoValidate(sc.nextLine());

				System.out.println("Enter the 10 digit Mobile No");
				String jobSeekerMobnum = DataValidator.mobNoValidate(sc.nextLine());

				System.out.println("Enter the Graduation Date in YYYY-MM-DD format");
				LocalDate jobSeekerGradDate = DataValidator.gradDateValidator(sc.nextLine());

				System.out.println("Enter the Graduation Stream (ME,CSE,CE,ExTC,ECE,IE)");
				Degree jobSeekerGradStream = Degree.valueOf(sc.nextLine());
				//				
				if(DataValidator.isDuplicateEntry(jobProfileList,new JobProfile(jobSeekerName,jobSeekerEmail,
						jobSeekerPassword,jobSeekerDOB,jobSeekerAddharID,jobSeekerMobnum, jobSeekerGradDate,jobSeekerGradStream))) {
					jobProfileList.add(new JobProfile(jobSeekerName,jobSeekerEmail,
							jobSeekerPassword,jobSeekerDOB,jobSeekerAddharID,jobSeekerMobnum, jobSeekerGradDate,jobSeekerGradStream));
					System.out.println("JobProfile Created Succesfully");
				}
				else {
					System.out.println("Duplicate Entry Found");
				}


			}break;


			case 2:
				String eater =sc.nextLine();
				System.out.println("Enter the Old mail which is to be Replaced");
				String oMail =sc.nextLine();
				for(JobProfile p :jobProfileList) {
					if(p.getEmail().equalsIgnoreCase(oMail)) {
						System.err.println("Account Found");
						System.out.println("Enter the New Mail to be Updated");
						p.setEmail(sc.nextLine());
					}
				}		

			case 3:{
				System.out.println("Enter the Branch Which you want to Display(ME,CSE,CE,ExTC,ECE,IE) ");
				String str =sc.nextLine(); 
				for(JobProfile jP :jobProfileList) {
					if(jP.getGradStream() == Degree.valueOf(str)) {
						System.out.println(jP.toString());
					}
				}
			}

			case 4:
				Collections.sort(jobProfileList);

			case 5:
				Collections.sort(jobProfileList,new Comparator<JobProfile>() {


					@Override
					public int compare(JobProfile o1, JobProfile o2) {
						return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
					}
				}
						);

			case 6:
				Collections.sort(jobProfileList,new Comparator<JobProfile>() {


					@Override
					public int compare(JobProfile o1, JobProfile o2) {
						return o1.getGraduationDate().compareTo(o2.getGraduationDate());
					}
				}
						);

			case 7:
				for(JobProfile jp1:jobProfileList) {
					System.out.println(jp1.toString());
				}
			}

		}while(choice!=0);
	}
}


