package com.acts.method.innerclass;

//Outer class
public class Outer {

	// Method inside outer class
	void outerMethod(){
		// Print statement
		System.out.println("inside outerMethod");

		// Method Local Inner class
		class Inner {

			// Method defined inside inner class
			void innerMethod(){

				// Print statement
				System.out.println("inside innerMethod");
			}
		}

		// Creating object of inner class
		Inner inner = new Inner();

		// Calling over method defined inside it
		inner.innerMethod();
	}
}