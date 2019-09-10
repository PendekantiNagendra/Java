package com.hcl.boxing;

public class EmploySearch {
	public Employ showEmploy(int empno) {
		Employ employ = null;
		if (empno == 1) {
			employ = new Employ();
			employ.empno = 100;
			employ.name = "Anubhav";
			employ.basic = 45896;
		}
		if (empno == 3) {
			employ = new Employ();
			employ.empno = 103;
			employ.name = "Yadav";
			employ.basic = 4545;
		}
		return employ;
	}

	public static void main(String[] args) {
		EmploySearch obj = new EmploySearch();
		Employ res = obj.showEmploy(1);
		if (res != null) {
			System.out.println(res);
		} else {
			System.out.println("Employ Not Found...");
		}

	}

}
