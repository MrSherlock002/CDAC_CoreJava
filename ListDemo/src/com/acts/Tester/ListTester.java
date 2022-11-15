package com.acts.Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListTester {
	public static void main(String[] args) {
		//create Arraylist
		//Dfault size
		LinkedList<Integer> linkedList = new LinkedList<>();
		//Add elements
		linkedList.add(10);
		linkedList.add(50);
		linkedList.add(120);
		linkedList.add(90);
		linkedList.add(100);
		linkedList.add(110);
		
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		//Add elements
		arrayList1.add(200);
		arrayList1.add(500);
		arrayList1.add(300);
		arrayList1.add(600);
		arrayList1.add(800);
		
		//Add elements from other arraylist
		
		linkedList.addAll(arrayList1);
		
		//get element using Index
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
				for(Integer value : linkedList) {
					System.out.print(" ");
					System.out.print(value); // arr[i]
				}
				
				System.out.println();
				System.out.println("List Iterator");
				ListIterator<Integer> iterator = linkedList.listIterator();
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				
				System.out.println("Direct Printing");
				System.out.println(linkedList);
				
				//Check whether element is present in list
				System.out.println("Element found:" + linkedList.contains(120));
				System.out.println("Element found:" + linkedList.contains(1000));
				
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
