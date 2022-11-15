package com.acts.containers.tester;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.acts.Address;
import com.acts.Bank;
import com.acts.Course;
import com.acts.DataUtils;
import com.acts.Bank;
import com.acts.ValidationUtils;
import com.acts.comparators.DateComparator;
import com.acts.comparators.NameComparator;

public class BankListTester {

	public static void main(String[] args) {
		List<Bank> bankList = DataUtils.getBankList();
		try ( Scanner sc = new Scanner(System.in)) {

			int choice;
			do {

				System.out.println("**********Menu********");
				System.out.println("1. Add Bank");
				System.out.println("2. Print Banks");
				System.out.println("3. Sort Banks by Account Number");
				System.out.println("4. Sort Banks by name");
				System.out.println("5. Sort Banks by Date of registration");
				System.out.println("6. Get total branch Balance ");
				System.out.println("7. Find Bank");
				System.out.println("0. Exit");
				
				System.out.println("Please enter your choice");
				
				choice = sc.nextInt();

				switch(choice) {
				case 1: {
					//Add Bank in list
					//Get Bank data from user
					System.out.println("Please enter user name");
					String username = sc.next();
					System.out.println("Please enter Account Number : ");
					String accNo = sc.next();
					System.out.println("Please enter Account Balance : ");
					String balance = sc.next();
					System.out.println("Please enter dob in yyyy-mm-dd format");
					String date = sc.next();

					//Get Address data from user
					System.out.println("Please enter line1");
					String line1 = sc.next();
					System.out.println("Please enter line2");
					String line2 = sc.next();
					System.out.println("Please enter pin");
					String pin = sc.next();


					LocalDate validDob = ValidationUtils.validateDate(date);
					//Course courseEnum = ValidationUtils.getValidCourse(course);

					if( null != validDob ){
						Address address = new Address(line1, line2, pin);
						//public Bank(String username, String accountNo, String balance, LocalDate dob)
						Bank bank = new Bank(username, accNo, balance, validDob);
						bank.addAddress(address);
						bankList.add(bank);
						System.out.println("Bank added successfully");
					}

				} break;
				case 2: {
					for(Bank Bank : bankList) {
					System.out.println(Bank);
					}
				} break;
				case 3: {
					//passing list and criteria will be used from Comparable
					Collections.sort(bankList);
				} break;
				case 4: {
					//passing list and criteria using Comparator
					Collections.sort(bankList, new NameComparator());
				}break;
				
				case 5: {
					//Using anonymous Inner class
					Collections.sort(bankList, new Comparator<Bank>() {
						@Override
						public int compare(Bank o1, Bank o2) {
							return o1.getTodayDate().compareTo(o2.getTodayDate());
						}
					});break;
				}
					
					case 6:{
						Bank bank = new Bank();
						System.out.println("Total Branch Balance : "+bank.getTotalAmount());
						
					}break;
					
				case 7: {
					//Find Bank by RNo and Update Name
					System.out.println("Please Account No");
					String accno = sc.next();
					Bank s1 = DataUtils.findByAccNo(bankList, accno);
					System.out.println("Bank Found please enter name to be updated");
					String name = sc.next();
					s1.setUsername(name);
//					Bank is present or not
					
					Bank Bank = new Bank();
					//Bank.setRollNo(rollNo);
					//Contains method internally call equals method
					boolean found = bankList.contains(Bank);
					System.out.println("Bank found :" + found);
				}break;
				case 0: {System.exit(0);} break;
				} 

			} while(choice != 0);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
