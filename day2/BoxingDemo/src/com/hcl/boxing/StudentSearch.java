package com.hcl.boxing;

public class StudentSearch {
	public Student showStudent(int sno){
		Student obj=null;
		if (sno == 1) {
			obj= new Student();
			obj.sno = 100;
			obj.name = "Anubhav";
			obj.city = "Bangalore";
			obj.cgp=8.6;
		}
		if (sno == 2) {
			obj= new Student();
			obj.sno = 101;
			obj.name = "Prem";
			obj.city = "Bangalore";
			obj.cgp=8.4;
		}
		return obj;
	}
	
	public static void main(String[] args) {
		StudentSearch  obj=new StudentSearch();
		Student student=obj.showStudent(2);
		if (student != null) {
			System.out.println(student);
		} else {
			System.out.println("Student Not Found...");
		}
		
	}

}
