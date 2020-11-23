package com.demo;

//Java program to demonstrate  a static member 
//can be accessed before instantiating a class 
class StaticDemo {
	// static method
	static void show() {
		System.out.println("Hi you there !!");
	}

	public static void main(String[] args) {
		// calling show without creating
		// any object of class StaticDemo
		show();
	}
}
