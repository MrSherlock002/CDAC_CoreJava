package com.acts.reflection.tester;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.acts.reflection.Student;

public class ContructorCallTester {

	public static void main(String[] args) throws Exception {
		
		Class<Student> studentClass = Student.class;
		

		Constructor<?>[] allConstructors = studentClass.getConstructors();
		System.out.println("\n\n----- Constructors of Student class -------------");  
		for (Constructor<?> constructor : allConstructors){ 
			System.out.println(constructor);  
		}  
		
		
		//Get Parameterized required ctor object and call it using reflection
		Constructor<Student> constructor = studentClass.getConstructor(int.class, String.class);
		Student s1 = constructor.newInstance(123, "Priyanka");
		System.out.println(s1);
		
		System.out.println("Dynamic method invocation of a private method");
		
		//Get private method object
		Method method = studentClass.getDeclaredMethod("doStudy");
		//Change Access specifier or give permission
		method.setAccessible(true);
		method.invoke(s1);
		System.out.println(s1);
		
	}

}
