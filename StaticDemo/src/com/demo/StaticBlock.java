package com.demo;

public class StaticBlock {
	static int x; // static variable
	static {
		x = 5; // initialize x using static block
	}

	static void square() {
		System.out.println("Square of x is : " + x * x);
	}

	public static void main(String[] args) {
		square(); // calling square method since it's a static method
		// so we don't need a object to call it.
	}

}
