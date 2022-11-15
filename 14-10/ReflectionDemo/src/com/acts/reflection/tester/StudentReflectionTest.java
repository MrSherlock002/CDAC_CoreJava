package com.acts.reflection.tester;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentReflectionTest   
{  
	public static void main(String[] args)  
	{  
		try   
		{  
			Class<?> clazz = Class.forName("com.acts.reflection.Student");  
			System.out.println("Class Name: " + clazz.getName());  
			System.out.println("Package Name: " + clazz.getPackage()); 
			//Class will be loaded by App class loader so it will print null
			System.out.println("Class Loader: " + clazz.getClassLoader()); 

			Field[] allFields = clazz.getDeclaredFields();
			System.out.println("\n\n-----All Fields of Student class -------------");  
			for (Field field : allFields){  
				System.out.println(field);  
			}  
//			or print using java8
//			Arrays.stream(fields).forEach(System.out::println);
			
			Field[] fields = clazz.getFields();
			System.out.println("\n\n-----Accessible/ Public Fields of Student class -------------");  
			for (Field field : fields){  
				System.out.println(field);  
			}  
//			or print using java8
//			Arrays.stream(allFields).forEach(System.out::println);
			

			Constructor<?>[] allConstructors = clazz.getDeclaredConstructors();
			System.out.println("\n\n----- All Constructor of Student class -------------");  
			for (Constructor<?> constructor : allConstructors){  
				System.out.println(constructor);  
			}  
//			or print using java8
//			Arrays.stream(constructors).forEach(System.out::println);
			
			Constructor<?>[] constructors = clazz.getConstructors();
			System.out.println("\n\n----- Accessible/ public  Constructor of Student class -------------");  
			for (Constructor<?> constructor : constructors){  
				System.out.println(constructor);  
			}  
//			or print using java8
//			Arrays.stream(constructors).forEach(System.out::println);
			

			Method[] allMethods = clazz.getDeclaredMethods();  
			System.out.println("\n\n-----Methods of String class -------------");  
			for (Method method : allMethods) {  
				System.out.println(method);  
			}  
//			or print using java8
//			Arrays.stream(methods).forEach(System.out::println);	
			

			Method[] methods = clazz.getMethods();  
			System.out.println("\n\n-----Accessible/ public  Methods of String class -------------");  
			for (Method method : methods) {  
				System.out.println(method);  
			}  
//			or print using java8
//			Arrays.stream(methods).forEach(System.out::println);	
			
		}  
		catch (ClassNotFoundException e)   
		{  
			e.printStackTrace();  
		}  
	}  
}  