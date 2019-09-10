package com.hcl.boxing;

public class BoxStudent {
	public void show(Object ob) {
		Student s = (Student) ob;
		System.out.println(s);
	}

	public static void main(String[] args) {
		Student objStudent1 = new Student();
		objStudent1.sno = 123;
		objStudent1.name = "Nagendra";
		objStudent1.city = "Bangalore";
		objStudent1.cgp = 8.5;
		
		Student objStudent2 = new Student();
		objStudent2.sno = 12;
		objStudent2.name = "Rishab";
		objStudent2.city = "Bangalore";
		objStudent2.cgp = 8;
		new BoxStudent().show(objStudent2);
		System.out.println(objStudent1.equals(objStudent2));
	}

}
 