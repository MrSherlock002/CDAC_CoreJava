package com.acts.reflection.tester;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class ClassAccessSpecfier {

	//Get class name from user and print its modifiers
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the Fully qualified name of  the class or interface or enum");
			
			String fullyQualifidClassName =  scanner.next();
			Class<?> clazz = Class.forName(fullyQualifidClassName);
			System.out.println(clazz.getName());
			
			if (!clazz.isInterface()) {
				// Display class modifiers
				int modifiers = clazz.getModifiers();
				System.out.println(Modifier.isPublic(modifiers) ? "Public" : "Default or ptovate");
				System.out.println(Modifier.isFinal(modifiers) ? "Final" : "Not final");
				System.out.println(Modifier.isAbstract(modifiers) ? "Abstract" : "Concrete");
				
				//Print all the interfaces implemented by the class
				Arrays.stream(clazz.getInterfaces()).forEach(System.out::println);
			} else {
				System.out.println("Entered name is of Interface");
				Arrays.stream(clazz.getInterfaces()).forEach(System.out::println);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
