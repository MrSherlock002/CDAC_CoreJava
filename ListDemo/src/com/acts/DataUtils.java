package com.acts;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class DataUtils {

	public static LinkedList<Student> getStudentList(){
		LinkedList<Student> list = new LinkedList<>();
		LocalDate validDob1 = ValidationUtils.validateDob("2000-05-10");
		LocalDate validDob2 = ValidationUtils.validateDob("2000-06-12");

		Course validCourse1 = ValidationUtils.getValidCourse("DAC");
		Course validCourse2 =  ValidationUtils.getValidCourse("DESD");

		list.add(new Student(170, "Mahesh", validDob1, validCourse1));
		list.add(new Student(171, "Ganesh", validDob1, validCourse1));
		list.add(new Student(172, "Suresh", validDob1, validCourse1));
		list.add(new Student(173, "Mani", validDob1, validCourse1));
		list.add(new Student(174, "Rani", validDob1, validCourse1));

		return list;
	}
	public static Student findByRollNo(List<Student>list, Integer rollNo) {

		for(Student s : list) {
			if( rollNo.equals(s.getRollNo())) {
				return s;
			}
		}
		return null;

	}
}
