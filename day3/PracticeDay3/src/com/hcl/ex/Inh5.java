package com.hcl.ex;

class Base {
	int a, b;

	public Base() {
		a = 5;
		b = 8;
	}

	@Override
	public String toString() {
		return "Base [a=" + a + ", b=" + b + "]";
	}
}

class Derived extends Base {
	public Derived(int a, int b) {

	}
}

public class Inh5 {
	public static void main(String[] args) {
		Derived obj = new Derived(12, 5);
		System.out.println(obj);
	}
}
