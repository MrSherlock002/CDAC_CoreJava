package com.acts.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.acts.Order;
import com.acts.Pet;
import com.acts.enums.OrderEnums;
import com.acts.enums.PetEnum;

public class PetTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String choice;
		String password,username;
		int flag=0;

		String petId;
		String name;
		String category;
		double unitPrice;
		int Stocks;

		List<Pet> petList = new ArrayList<Pet>();
		List<Order> orderList = new ArrayList<Order>();		


		do {
			System.out.println("a. Login.\n \n"
					+ "b. Add new Pet.\n"
					+ "c. Update pet details.\n"
					+ "d. Display all available pets.\n"
					+ "e. Order a pet.\n"
					+ "f. Check order status by order ID.\n"
					+ "g. Update order status.\n"
					+ "h. Exit\n\n"
					+ "Enter your choice : \n");
			choice = sc.next();

			switch(choice) {
			case ("a"):
				System.out.println("Enter a username : ");
			username = sc.next();

			System.out.println("Enter a password : ");
			password = sc.next();
			if(username=="admin"&& password=="admin") {
				flag = 1;
			}
			else if(username=="c1"&& password=="c1") {
				flag=0;
			}
			break;

			case ("b"):
				if(flag==1) {
					System.out.println("Enter a pet ID : ");
					petId = sc.next();
					System.out.println("Enter a pet name : ");
					name = sc.next();
					System.out.println("Enter a category : ");
					category = sc.next();
					System.out.println("Enter a pet price : ");
					unitPrice = sc.nextDouble();
					System.out.println("Enter a pet stock : ");
					Stocks = sc.nextInt();	

					Pet p = new Pet(petId, name, PetEnum.valueOf(category), unitPrice, Stocks);
					petList.add(p);

				}else {
					System.out.println("For Admin use only.");
				}
			break;

			case ("c"):
				if(flag==1) {
					System.out.println("Enter a pet ID : ");
					petId = sc.next();
					System.out.println("Enter a pet name : ");
					name = sc.next();
					System.out.println("Enter a category : ");
					category = sc.next();
					System.out.println("Enter a pet price : ");
					unitPrice = sc.nextDouble();
					System.out.println("Enter a pet stock : ");
					Stocks = sc.nextInt();	

					Pet p = new Pet(petId, name, PetEnum.valueOf(category), unitPrice, Stocks);
					petList.add(p);

				}else {
					System.out.println("For Admin use only.");
				}

			break;
			case ("d"):
				System.out.println("Here is the pet list :");
			petList.forEach((a)-> {System.out.println(a.toString());});
			break;

			case ("e"):
				System.out.println("Enter Pet which do you want to buy : ");
				String bPet = sc.next().toUpperCase();
				System.out.println("Enter quantity : ");
				int qty = sc.nextInt();
				petList.forEach((a)-> {
					if(a.getCategory().equals(PetEnum.valueOf(bPet))) {
						System.out.println("Price for this Pet is : "+a.getUnitPrice());
						a.setStocks(a.getStocks()-qty);
	
						System.out.println("");
						Order o = new Order(a.getPetId(), bPet, OrderEnums.valueOf(bPet), a.getUnitPrice(), qty);
						
						orderList.add(o);
					}
				});

			break;

			case("f"):
				System.out.println("Enter Id of Order : ");
			String tempId = sc.next().toUpperCase();
				
				orderList.forEach((a)-> {
					if(tempId.equals(a.getPetId())) {
						System.out.println(a.getCategory());
					}
				});
				
				break;

			case ("g"):
				System.out.println("Enter  order Id to update  :");
			String tempId1 = sc.next();
			
			orderList.forEach((a)-> {
				if(tempId1.equals(a.getPetId())) {
					System.out.println("Found ..!!\n Enter a new Status to update : ");
					String newStatus = sc.next().toUpperCase();
						//System.out.println(a.setCategory((OrderEnums.valueOf(newStatus))));
					
				}
			});
			
				break;

			case ("h"):
				System.exit(0);
			break;				
			}


		}while(choice!="h");
	}
}
