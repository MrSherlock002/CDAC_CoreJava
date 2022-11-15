package com.acts.Tester;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.acts.Course;
import com.acts.DataPrinter;
import com.acts.DataUtils;
import com.acts.Student;
import com.acts.ValidationUtils;


public class LinkedListTester1 {

		public static void main(String[] args) {

			//Create Linked list
			LinkedList<Student>  list = DataUtils.getStudentList();
			for(Student student : list) {
				System.out.println(student);
			}

			Student s1 = list.peek();
			System.out.println("\n Peek\t " +s1);
			for(Student student : list) {
				System.out.println(student);
			}


			Student s2 = list.poll();
			System.out.println("\n Poll\t" +s2);
			for(Student student : list) {
				System.out.println(student);
			}


		}

	}
