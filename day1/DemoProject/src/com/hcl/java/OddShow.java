package com.hcl.java;

public class OddShow {
	public void show(int n) {
		int i = 0;
		while (i < n) {
			i = i + 1;
			System.out.println("Odd :" + i);
		}
	}

	public static void main(String[] args) {

		int n = 20;
		new OddShow().show(n);
		// TODO Auto-generated method stub
	}
}
