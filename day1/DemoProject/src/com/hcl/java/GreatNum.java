package com.hcl.java;

public class GreatNum {
	public void getGreatest(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(" Greatest Num" + a);
		} else if (b > c) {
			System.out.println(" Greatest Num" + b);
		} else {
			System.out.println(" Greatest Num" + c);
		}
	}

	public static void main(String[] args) {
		int a = 5, b = 6, c = 7;
		new GreatNum().getGreatest(a, b, c);
	}
}
