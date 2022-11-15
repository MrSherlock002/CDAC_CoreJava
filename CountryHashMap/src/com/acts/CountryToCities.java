package com.acts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Scanner;

public class CountryToCities {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, HashMap<String, List<String>>> myMap = new HashMap<String, HashMap<String, List<String>>>();

		int choice;
		String country;
		int check;
		int check1;
		do {
			System.out.println("1. Add Country "
					+ "\n2. Print all Countries"
					+ "\n3. Print ALL Countries (Another way)"
					+ "\n0. Exit");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				HashMap<String, List<String>> states = new HashMap<String, List<String>>();
				System.out.println("Enter the Country Name : ");
				country = sc.next();
				System.out.println("Enter the states names : ");

				do {
					System.out.println("1. Add State \n "
							+ "0. Exit");
					check = sc.nextInt();

					switch(check) {
					case 1 : 
						ArrayList<String> cities = new ArrayList<String>();
						String statename;
						System.out.println("Enter State name : ");
						statename = sc.next();
						
						System.out.println("Enter city name : ");
						do {
							System.out.println("1. Add city \n "
									+ "0. Exit");
							check1 = sc.nextInt();
							
							switch(check1) {
							case 1:
								String city;
								System.out.println("Enter city name : ");
								city= sc.next();
								
								cities.add(city);
								break;
							}
						
						}while(check1!=0);
						states.put(statename, cities);
						myMap.put(country,states);
						break;
					}
				}
				while(check!=0);
				break;

			case 2:
				System.out.println("Displaying list of country and their states");
				for(Entry<String, HashMap<String, List<String>>> e:myMap.entrySet()) {
					System.out.print(e.getKey()+"\t");
//					for(String state:e.getValue())
//						System.out.println(state);
				}
				break;

			case 3:
				System.out.println("*************************");
				System.out.println(myMap);
				System.out.println("*************************");			

			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Enter correct input..!!");
			}
		}while(choice !=0);
	}
}
