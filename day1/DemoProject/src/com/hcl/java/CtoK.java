package com.hcl.java;

public class CtoK {
	public void calc(double c){
		double k;
		k=273.15+c;
		System.out.println("Kelvin Value " +k);
	}
	public static void main(String[] args) {
		double c=37;
		CtoK obj=new CtoK();
		obj.calc(c);
		}
}
