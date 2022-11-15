package com.acts.Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListTester1 {

	public static void main(String[] args) {

		//Create arrayList
		//Default type

		LinkedList<String> linkedList = new LinkedList<>();
		//Add elements
		linkedList.add("Hi");
		linkedList.add("hello");
		linkedList.add("How are you");
		ArrayList<String> arrayList1 = new ArrayList<>();
		//Add elements
		//Add elements from other arraylist 
		arrayList1.add("Bye");
		arrayList1.add("tata");
		arrayList1.add("see you");

		


		linkedList.addAll(arrayList1);

		//get element using index
		System.out.println(linkedList.get(3));


		//Remove element by index
		System.out.println("Removed ele :" +linkedList.remove(1));

		//
		//Printing list
		System.out.println("Traditional for");
		for( int i =0 ; i < linkedList.size(); i++ ) {
			System.out.print(" ");
			System.out.print(linkedList.get(i)); // arr[i]
		}

		System.out.println();
		System.out.println("Advanced for");
		for(String value : linkedList) {
			System.out.print(" ");
			System.out.print(value); // arr[i]
		}

		System.out.println();
		System.out.println("List Iterator");
		ListIterator<String> iterator = linkedList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("Direct Printing");
		System.out.println(linkedList);

		//Check whether element is present in list
		System.out.println("Element found:" + linkedList.contains("No"));
		System.out.println("Element found:" + linkedList.contains("Bye"));

		//Check for elements
		System.out.println("All element found:" + linkedList.containsAll(arrayList1));


		if(!linkedList.isEmpty()) {
			// to check whether empty
			System.out.println("List not empty");
		}

		//Convert to plain array
		Object[] arr = linkedList.toArray();
		System.out.println(Arrays.toString(arr));

		//Sort
		Collections.sort(linkedList);

		System.out.println("Sorted Printing");
		System.out.println(linkedList);

	}

}
