package com.hcl.boxing;

public class stDemo {
	void show(){
		System.out.println("From Show Method...");
	}
	static void display(){
		System.out.println("From Display Method");
	}
public static void main(String[] args) {
	 stDemo.display();
	new stDemo().show();
}
}
