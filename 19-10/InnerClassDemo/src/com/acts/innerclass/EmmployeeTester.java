package com.acts.innerclass;

public class EmmployeeTester {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(100);
		//Outerclass.InnerClass = objectOfOuter.new InnerClass();
		Employee.Address address = e1.new Address();
		e1.setAddress(address);
	}
}
