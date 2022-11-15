package com.acts.threads.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ThreadUnSafeCollection {
	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<>();
		
		//Get IntStream 1 to 500 and add to list created above
		IntStream.range(1, 500).forEach(list::add);
		
		//Creating Thread using Anonymous class
		//Target I/F Runnable and method run()
		Thread iterator = new Thread(() -> {
			list.forEach(System.out::println);
		}, "iteratorThread");
		
		//Creating Thread using Anonymous class
		//Target I/F Runnable and method run()
		Thread modifier = new Thread(() -> {
			//Get from list and add in list
			list.forEach(list::add);
		}, "modifierThread");
		
		iterator.start();
		modifier.start();
		iterator.join();
		modifier.join();
		System.out.println("Main Completed");
	}
}