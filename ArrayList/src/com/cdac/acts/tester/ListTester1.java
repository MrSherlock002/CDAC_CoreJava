package com.cdac.acts.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListTester1 {

	public static void main(String[] args) {
		//Create ArrayList
		//Default size
		ArrayList<String> arrayList = new ArrayList<>();
		//Add elements
		arrayList.add("Hi");
		arrayList.add("hello");
		arrayList.add("How are you");

		System.out.println(arrayList);


		ArrayList<String> arrayList1 = new ArrayList<>();
		//Add elements
		arrayList.add("Bye");
		arrayList.add("tata");
		arrayList.add("see you");
		System.out.println(arrayList);
		System.out.println(arrayList1);

		
		//Add elements from other arrayList
		

		arrayList.addAll(arrayList1);

		//get element using Index
		System.out.println(arrayList.get(3));

		//Remove element by index
		System.out.println("Removed ele :" +arrayList.remove(2));
		//Printing list
		System.out.println("Traditional for");
		for(int i =0; i < arrayList.size(); i++ ) {
			System.out.print(" ");
			System.out.print(arrayList.get(i));//arr[i]
		}
		System.out.println("\nAdvanced for");
		for (String value : arrayList) {
			System.out.print(" ");
			System.out.print(value);//arr[i]
		}

		System.out.println("\nList Iterator");
		ListIterator<String> iterator = arrayList.listIterator();
		while(iterator.hasNext()) {
			System.out.print(" ");
			System.out.print(iterator.next());
		}
		
		System.out.println("\nDirect Printing");
		System.out.println(arrayList);

		//Check whether element is present in list
		System.out.println("Element found:" + arrayList.contains("Hi"));
		System.out.println("Element found:" + arrayList.contains("bye"));

		
		arrayList1.add("bkj");

		//Check for elements
		System.out.println("All element found:" + arrayList.containsAll(arrayList1));


		if(!arrayList.isEmpty()) {
			// to check whether empty
			System.out.println("List not empty");
		}

		//Convert to plain array
		Object[] arr = arrayList.toArray();
		System.out.println(Arrays.toString(arr));

		//Sort
		Collections.sort(arrayList);

		System.out.println("Sorted Printing");
		System.out.println(arrayList);

	}

}