package com.acts.reflection.tester;

import java.time.LocalDate;

public class ClassNameTester {

	public static void main(String[] args) {
		//Print class name
		Class<?> clazz;
		try {
			clazz = Class.forName("java.lang.System");

			System.out.println(clazz.getCanonicalName());
			if(clazz.isInterface()) {
				System.out.println("1. loaded class is Interface");
			}
			
			clazz = Class.forName("java.util.List");
			System.out.println(clazz.getName());
			if(clazz.isInterface()) {
				System.out.println("2. loaded class is Interface");
			}
			
			//Get class from object
			LocalDate localDate = LocalDate.now();
			clazz = localDate.getClass();
			System.out.println(clazz.getName());
			System.out.println(localDate);
			
			//using .class directly
			System.out.println(String.class.getName());
			
			int[]arr = {1,2,3,4,5,6,7};
			System.out.println(arr.getClass().getName());//[[I
			
			//for primitive type 
			clazz = int.class;
			System.out.println(clazz.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
