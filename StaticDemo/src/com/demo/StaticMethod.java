package com.demo;

public class StaticMethod {
	static int a, b; // static variable

	static void test() {
		a = 10; // initialize value of a and b
		b = 20;
		System.out.println(add(a, b)); // call static add method directly
	}

	static int add(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) // main is also a static method so we can directly call
	{
		test(); // calling test method
	}

}
