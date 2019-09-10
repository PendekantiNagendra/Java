package com.hcl.boxing;

class Demo2 {
	static {
		System.out.println("Hi");
	}

}

public class Demo {
	public static void main(String[] args) {
		System.out.println("Bye");
	}

	static {
		System.out.println("Hello");
	}
}