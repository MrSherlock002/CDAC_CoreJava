package com.acts.statics.innerclass;

public class EmmployeeTester {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(100);
		//Outerclass.InnerClass = new OuterClass.InnerClass();
		Employee.Address address = new Employee.Address();
		e1.setAddress(address);
	}
}
