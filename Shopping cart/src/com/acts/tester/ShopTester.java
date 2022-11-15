package com.acts.tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.acts.Cart;
import com.acts.DataUtils;
import com.acts.GenerateBill;
import com.acts.Stock;

public class ShopTester extends Stock {

	public static void main(String[] args) {

		List<Integer> mycart = new ArrayList<>();
		//List<Integer> productqty = new ArrayList<>();
		//Stock stockObj = new Stock();
		//Stock stockObj = new Stock(5,10,5,50,5,10,5,50);
		DataUtils x = new DataUtils();
		{System.out.println(x.addData());}

		//Stock stockObj = new Stock();
		Stock stockObj = new Stock(5,10,5,50,5,10,5,50);
		Scanner sc = new Scanner(System.in);
		String name;
		int choice;
		int qty;
		HashMap<String,Integer> cartList = new HashMap<String,Integer>();
		cartList.put("Pen", 0);
		cartList.put("Notebook", 0);
		cartList.put("Biskit", 0);
		cartList.put("Milk", 0);

		/* System.out.println(cartList); */
		//		cartList.forEach((String k,Integer v)->System.out.println("Key= "+k+"\nValue= "+v));

		System.out.println("Enter your name : ");
		name = sc.nextLine();

		Cart mycartobj = new Cart();

		do {
			System.out.println("\n 1.Buy Pen\n "
					+ "2. Buy Notebook \n "
					+ "3. Buy Biskit \n"
					+ "4. Buy Milk\n"
					+ "5. Generate Bill\n"
					+ "6. Total Stock\n"
					+ "0. Exit");
			choice = sc.nextInt();
			//System.out.println("Pen Stock :"+getPen());

			switch(choice) {
			case 1 :
				System.out.println("Pen Stock :"+stockObj.getPen());
				System.out.println("Enter quantity : ");
				qty = sc.nextInt();
				if(stockObj.getPen()<qty) {
					System.out.println("Stock of Pen is not enough.\n Please enter quantity within limit.");
				}
				else {
					int temp = cartList.get("Pen");
					int qty_1 = qty;
					qty = qty+temp;
					cartList.put("Pen",qty);
					//cartList.forEach((String k,Integer v)->System.out.println("Key= "+k+" Value= "+v+"\n"));
					mycart.add(choice);
					mycart.add(qty);
					//productqty.add(qty);

					stockObj.setPen(stockObj.getPen()-qty_1);
				}
				break;

			case 2 : 
				System.out.println("Notebook Stock :"+stockObj.getNotebook());
				System.out.println("Enter quantity : ");
				qty = sc.nextInt();

				if(stockObj.getNotebook()<qty) {
					System.out.println("Stock of Notebook is not enough.\n Please enter quantity within limit.");
				}
				else {
					int temp = cartList.get("Notebook");
					int qty_1 = qty;
					qty = qty+temp;
					cartList.put("Notebook",qty);
					mycart.add(choice);
					mycart.add(qty);
					//productqty.add(qty);

					stockObj.setNotebook(stockObj.getNotebook()-qty_1);
				}
				break;

			case 3 :
				System.out.println("Biskit Stock :"+stockObj.getBiskit());
				System.out.println("Enter quantity : ");
				qty = sc.nextInt();

				if(stockObj.getBiskit()<qty) {
					System.out.println("Stock of Biskit is not enough.\n Please enter quantity within limit.");
				}
				else {
					int temp = cartList.get("Biskit");
					int qty_1 = qty;
					qty = qty+temp;
					cartList.put("Biskit",qty);
					mycart.add(choice);
					mycart.add(qty);
					//productqty.add(qty);

					stockObj.setBiskit(stockObj.getBiskit()-qty_1);
				}
				break;

			case 4:
				System.out.println("Milk Stock :"+stockObj.getMilk());
				System.out.println("Enter quantity : ");
				qty = sc.nextInt();

				if(stockObj.getMilk()<qty) {
					System.out.println("Stock of Milk is not enough.\n Please enter quantity within limit.");
				}
				else {
					int temp = cartList.get("Milk");
					int qty_1 = qty;
					qty = qty+temp;
					cartList.put("Milk",qty);
					mycart.add(choice);
					mycart.add(qty);
					//productqty.add(qty);

					stockObj.setMilk(stockObj.getMilk()-qty_1);
				}
				break;

			case 5:
				GenerateBill b = new GenerateBill();
				System.out.println("Hello "+name+" Your Bill : "+b.bill(cartList)+"\n ****Thank You****\n **Visit Again**");
				break;
			case 6:
				System.out.println("1. Stock of Pen : "+stockObj.getPen());
				System.out.println("2. Stock of Notebook : "+stockObj.getNotebook());
				System.out.println("3. Stock of Biskit : "+stockObj.getBiskit());
				System.out.println("4. Stock of Milk : "+stockObj.getMilk());
				break;
			case 0 :
				System.exit(0);
			default:
				System.out.println("Enter correct input....!!");
			}
		}while(choice!=0);
	}
}
