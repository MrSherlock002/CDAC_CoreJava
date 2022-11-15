package com.acts;

import java.util.ArrayList;
import java.util.HashMap;

import com.acts.tester.ShopTester;

public class GenerateBill extends Stock {

	public int total_bill;
//	public int bill(ArrayList<Integer> s) {
		public int bill(HashMap<String, Integer> cart) {
		//Stock stockObj = new Stock();
		ShopTester shopObj = new ShopTester();
		//System.out.println("pen "+stockObj.pen_price+"\nNotebook "+stockObj.notebook_price+"\n Biskit "+stockObj.biskit_price+"\nMilk "+stockObj.milk_price);
		
		//total_bill = stockObj.getPen_price()*1 + stockObj.getNotebook_price()*1 + stockObj.getBiskit_price()*1 + stockObj.getMilk_price()*1;
		total_bill = this.getPen_price()*cart.get("Pen") + this.getNotebook_price()*cart.get("Notebook") + this.getBiskit_price()*cart.get("Biskit") + this.getMilk_price()*cart.get("Milk");
		System.out.println(total_bill);

		return total_bill;
	}
}
