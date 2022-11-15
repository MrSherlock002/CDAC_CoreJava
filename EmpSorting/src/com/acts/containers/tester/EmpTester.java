package com.acts.containers.tester;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.acts.Address;
import com.acts.Engineering;
import com.acts.DataUtils;
import com.acts.Emp;
import com.acts.ValidationUtils;
import com.acts.comparators.EnggComparator;
import com.acts.comparators.DateComparator;
import com.acts.comparators.NameComparator;

public class EmpTester {

	public static void main(String[] args) {
		List<Emp> empList = DataUtils.getEmpList();
		try ( Scanner sc = new Scanner(System.in)) {

			int choice;
			do {

				System.out.println("**********Menu********");
				System.out.println("1. Add Emp");
				System.out.println("2. Print Emp");
				System.out.println("3. Sort Emp by EmpId");
				System.out.println("4. Sort Emp by name");
				System.out.println("5. Sort Emp by engg");
				System.out.println("6. Sort Emp by Date");
				System.out.println("7. Find Emp");
				System.out.println("0. Exit");
				
				System.out.println("Please enter your choice");
				
				choice = sc.nextInt();

				switch(choice) {
				case 1: {
					System.out.println("Please enter EmpId : ");
					Integer empId = sc.nextInt();
					System.out.println("Please enter name");
					String empName = sc.next();
					System.out.println("Please enter dob in yyyy-mm-dd format");
					String date = sc.next();
					System.out.println("Please enter Engg branch : ");
					String engg = sc.next();

					//Get Address data from user
					System.out.println("Please enter line1");
					String line1 = sc.next();
					System.out.println("Please enter line2");
					String line2 = sc.next();
					System.out.println("Please enter pin");
					String pin = sc.next();


					LocalDate validDate = ValidationUtils.validateDate(date);
					Engineering enggEnum = ValidationUtils.getValidEngg(engg);

					if( null != validDate && null != enggEnum){
						Address address = new Address(line1, line2, pin);
//						public Emp(Integer empId, String empName, Engineering engg, LocalDate date, List<Address> addressList)
						Emp myEmp = new Emp(empId, empName, enggEnum, validDate);
//						myEmp.setAddressList(address);
//						myEmp.addAddress(address);
//						empList.add();
						System.out.println("Employee added successfully");
					}
				} break;
				case 2: {
					for(Emp student : empList) {
					System.out.println(student);
					}
				} break;
				case 3: {
					//passing list and criteria will be used from Comparable
					Collections.sort(empList);
				} break;
				case 4: {
					//passing list and criteria using Comparator
					Collections.sort(empList, new NameComparator());
				}break;
				case 5: {
					//passing list and criteria using Comparator
					Collections.sort(empList, new EnggComparator());
				}break;
				case 6: {
					//1. passing list and criteria using Comparator 
					//Collections.sort(empList, new DobComparator());
					//2. passing list and criteria using On the fly Comparator
					//Using anonymous Inner class
//					Comparator<Student> dobComparator =  new Comparator<Student>() {
//						@Override
//						public int compare(Student o1, Student o2) {
//							return o1.getDob().compareTo(o2.getDob());
//						}
//					};
//					Collections.sort(empList, dobComparator);
					
					//3. passing list and criteria using On the fly Comparator
					//Using anonymous Inner class
					Collections.sort(empList, new Comparator<Emp>() {
						@Override
						public int compare(Emp o1, Emp o2) {
							return o1.getDate().compareTo(o2.getDate());
						}
					});
					
					
				}break;
				case 7: {
					//Find student by RNo and Update Name
					System.out.println("Please enter Roll No");
					int empId = sc.nextInt();
//					Student s1 = DataUtils.findByRollNo(empList, rollNo);
//					System.out.println("Student Found please enter name to be updated");
//					String name = sc.next();
//					s1.setName(name);
					//Student is present or not
					
					Emp emp = new Emp();
					emp.setEmpId(empId);
					//Contains method internally call equals method
					boolean found = empList.contains(emp);
					System.out.println("Student found :" + found);
				}break;
				case 0: {System.exit(0);} 
				break;
				} 

			} while(choice != 0);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
