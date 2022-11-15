package com.acts.reflection.tester;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringReflectionTest   
{  
	public static void main(String[] args)  
	{  
		try   
		{  
			Class<?> clazz = Class.forName("java.lang.String");  
			System.out.println("Class Name: " + clazz.getName());  
			System.out.println("Package Name: " + clazz.getPackage()); 
			//Class will be loaded by Bootstrap loader so it will print null
			System.out.println("Class Loader: " + clazz.getClassLoader()); 

			Field[] fields = clazz.getDeclaredFields();

			System.out.println("\n\n-----Declared Fields of String class -------------");  
			for (Field field : fields){  
				System.out.println(field);  
			}  
			
			Field[] allFields = clazz.getFields();

			System.out.println("\n\n-----Fields of String class -------------");  
			for (Field field : allFields){  
				System.out.println(field);  
			}  

			Constructor<?>[] constructors = clazz.getDeclaredConstructors();

			System.out.println("\n\n-----Constructor of String class -------------");  
			for (Constructor<?> constructor : constructors){  
				System.out.println(constructor);  
			}  

			

			Method[] methods = clazz.getDeclaredMethods();  
			System.out.println("\n\n-----Methods of String class -------------");  
			for (Method method : methods) {  
				System.out.println(method);  
			}  
		}  
		catch (ClassNotFoundException e)   
		{  
			e.printStackTrace();  
		}  
	}  
}  