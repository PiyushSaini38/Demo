package com.demo;

//Java program to demonstrate how to implement 
//static and non-static classes in a Java program. 
class OuterClass {
	static String name = "Gaurav";
	String lastName = "Rathore";

	// Static nested class
	static class NestedStaticClass {

		// Only static members of Outer class
		// is directly accessible in nested static class
		public void show() {

			System.out.println("Variable of outer class access in static inner class: " + name);
		}
	}

	// Non-static nested class also called Inner class
	public class InnerClass {

		// Both static and non-static members
		// of Outer class are accessible in this Inner class
		public void display() {
			System.out.println("Variable of outer class access in inner class:" + name + " " + lastName);
		}
	}
}

class Main {

	public static void main(String args[]) {

		// Create instance of nested Static class
		OuterClass.NestedStaticClass print = new OuterClass.NestedStaticClass();

		// Call non static method of nested static class using reference variable print
		print.show();

		// In order to create an instance of Inner class
		// we need an Outer class instance.
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();

		// Calling non-static method of Inner class
		inner.display();

		// We can also combine above steps in one step
		// to create instance of Inner class
		OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();

		// Similarly we can now call Inner class method
		innerObject.display();
	}
}
