package com.cdac.acts.tester;

import java.util.ArrayList;
import java.util.Scanner;



//	Date : 12/10/2022
//  Day Wednesday
//  @author  Prasad Bhosale
public class SimpleTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int choice;
		ArrayList<String> list = new ArrayList<String> ();

		do {
			System.out.println("********** String Menu ********* "
					+ "\n1. Add String : "
					+ "\n2. Print all Strings : "
					+ "\n3. Search desired String : "
					+ "\n4. Remove Element by index : "
					+ "\n5. STOP / CLOSE "
					+ "\n\n Enter your choice : ");
			choice = sc.nextInt();

			switch(choice) {
			case 1 : input = sc.next();
			list.add(input);
			break;

			case 2 : 
				System.out.println("Here are the total elements of list ");
				System.out.println(list);

				break;

			case 3 : 
				System.out.println("Enter a string which you want to find ....");
				input = sc.next();
				boolean b =list.contains(input);
				System.out.println(b);
				break;

			case 4:
				System.out.println("Enter a index which you want to remove....");
				int index;
				index =sc.nextInt();
				System.out.println(list.remove(index));
				System.out.println("Now, Size of list: " + list.size()); 
				break;

			case 5 :
				System.out.println("Thank You..!!");
				System.exit(0);
				break;

			default : System.out.println("Please enter valid input.");
			}
		}while(choice!=5);
	}
}
