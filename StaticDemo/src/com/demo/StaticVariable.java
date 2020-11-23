package com.demo;

//Java program to demonstrate  a static member variable
class StaticVariable {
	static int price;

	static {
		price = 1000; // Initialize price with some value inside a static block
	}

	static int calculate() {
		int quantity = 10; // we must initialize a local variable at the time of declaration
		return quantity * price;
	}

	public static void main(String[] args) {

		StaticVariable v = new StaticVariable();
		System.out.println(v.price); // we can access static variable using instance method also but
//		it is not recommended because static belongs to a particular class
		System.out.println(StaticVariable.price); // access using class name
		int totalPrice = calculate();
		System.out.println("The total price is " + totalPrice);
	}
}
