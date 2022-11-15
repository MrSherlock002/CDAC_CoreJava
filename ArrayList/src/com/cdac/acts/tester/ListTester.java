package com.cdac.acts.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class ListTester {
	public static void main(String[] args) {
		//Create ArrayList
		//Default Size
		ArrayList<Integer> arrayList = new ArrayList<>();
		//Add elements\
		arrayList.add(10);
		arrayList.add(50);
		arrayList.add(30);
		arrayList.add(60);
		arrayList.add(90);
		arrayList.add(150);
		System.out.println("arrayList : "+arrayList);

		ArrayList<Integer> arrayList1 = new ArrayList<>();
		//Add elements\
		arrayList1.add(200);
		arrayList1.add(500);
		arrayList1.add(300);
		arrayList1.add(600);

		//Add elements from other arrayList

		arrayList.addAll(arrayList1);
		System.out.println("arrayList1 : "+arrayList1);
		System.out.println("arrayList : "+arrayList);

		//get element using Index
		System.out.println(arrayList.get(3));


		//Remove element by index
		System.out.println("Remove ele : "+arrayList.remove(2));
		//Printing List
		System.out.println("Traditional for");
		for(int i =0; i < arrayList.size(); i++ ) {
			System.out.print(" ");
			System.out.print(arrayList.get(i));//arr[i]
		}
		System.out.println("\nAdvanced for");
		for (Integer value : arrayList) {
			System.out.print(" ");
			System.out.print(value);//arr[i]
		}

		System.out.println("\nList Iterator");
		ListIterator<Integer> iterator = arrayList.listIterator();
		while(iterator.hasNext()) {
			System.out.print(" ");
			System.out.print(iterator.next());
		}
		
		System.out.println("\nDirect Printing");
		System.out.println(arrayList);
		
		//check whether element is present in list
		System.out.println("Element found:" + arrayList.contains(150));
		System.out.println("Element found:" + arrayList.contains(5000));
		
		//check for elements
		System.out.println("All element found:"+arrayList.containsAll(arrayList1));
		
		if(!arrayList.isEmpty()) {
			// to check whether empty 
			System.out.println("List is not empty");
		}
		
		//convert to plain array 
		Object[] arr = arrayList.toArray();
		System.out.println(Arrays.toString(arr));
		
		//sort
		Collections.sort(arrayList);
		System.out.println("Sorted Printing");
		System.out.println(arrayList);
		
	}


}
