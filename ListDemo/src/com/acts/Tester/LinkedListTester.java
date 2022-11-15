package com.acts.Tester;

import java.time.LocalDate;
import java.util.LinkedList;

import com.acts.Course;
import com.acts.DataUtils;
import com.acts.Student;
import com.acts.ValidationUtils;

public class LinkedListTester {

	public static void main(String[] args) {
		//create Linked List

		LinkedList<Student> list = DataUtils.getStudentList();
		for(Student student : list) {
			System.out.println(student);
		}

		//Push pop
		LocalDate validDob1 = ValidationUtils.validateDob("2001-02-01");

		Course validCourse1 = ValidationUtils.getValidCourse("DAC");
		list.push(new Student (129,"Prasad",validDob1,validCourse1));

		list.push(new Student (130,"Sanket",validDob1,validCourse1));

		System.out.println("*********************************");

		for(Student student : list) {
			System.out.println(student);
		}
		Student s = list.pop();
		System.out.println("Popped"+s);		
		Student s1 = list.getFirst();
		System.out.println("First" +s1);
		Student s2 = list.getLast();
		System.out.println("Last" +s2);
//
//		list.removeFirst();
//		list.removeLast();
		System.out.println("*********************");

		for(Student student : list) {
			System.out.println(student);
		}
	}
}