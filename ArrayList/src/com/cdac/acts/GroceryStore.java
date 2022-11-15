package com.cdac.acts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GroceryStore {
	public static void main(String[] args) {
		boolean check = false, check1 = false;
		int num = 0, num1 = 0, amount =0;
		String[] itemArray = {"Sugar", "Tea","Oil", "Soap"};
		ArrayList <String> cart = new ArrayList<>();
		boolean discount = false;
		int cartItem = 0;
		Arrays.sort(itemArray);
		System.out.println(Arrays.toString(itemArray));
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("*****Welcome to CDAC ACTS GROCERY STORE*****"
					+ "\n1.For Grocery Items"
					+ "\n2.Apply Discont"
					+ "\n3.Generate Bill\n"
					+ "4.Exit\n"
					+ "Choose from above available options : \n");
			num = sc.nextInt();
			switch(num) {
			case 1: {
				check1 = false;
				while(check1 == false) {
					System.out.println("*****Welcome to GROCERY SECTION*****"
							+ "\nItemCode|Items   | Price\n101    |  Sugar  |50rs"	+ "\n102    |  Tea    |60rs" + "\n103    |  "
							+ "Oil    |170rs"
							+  "\n104    |  Soap   |30rs" + "\n0.Stop ");
					num1 = sc.nextInt();
					switch(num1) {
					case 101 : {
						cart.add("Sugar");
						cartItem++;
						amount += 50;
						break;
					}
					case 102 : {
						cart.add("Tea");
						cartItem++;
						amount += 60;
						break;
					}
					case 103 : {
						cart.add("Oil");
						cartItem++;
						amount += 170;
						break;
					}
					case 104 : {
						cart.add("Soap");
						cartItem++;
						amount += 30;
						break;
					}
					case 0: check1 = true;
					}
				}
			}break;
			case 2 : {
				System.out.println("10%  Discount is applied... \nGenerate bill to see the discount");
				discount = true;
			}break;

			case 3:{
				System.out.println("Items in your cart and prices : ");
				Collections.sort(cart);
				for(String str : cart) {
					if(str.equals("Sugar")) {
						System.out.println("  " +str + "  50 rs");

					}
					if(str.equals("Tea")) {
						System.out.println("  " +str + "  60 rs");	
					}
					if(str.equals("Oil")) {
						System.out.println("  " +str + "  170 rs");

					}
					if(str.equals("Soap")) {
						System.out.println("  " +str + "  30 rs");

					}
				}
				System.out.println("\nYour total Bill is" + amount );
				if(discount == true) {
					System.out.println("Your total Bill after applying Discount(10%) is : " + amount * 0.90 );					
				}
				System.out.println();
				break;

			}
			case 4: {
				System.out.println("Thank you...Come Again");
				check = true;
				break;
			}
			}
		}while(check == false);
	}
}
