package com.hcl.project;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	static List<Student> lstStudent = null;
	static {
		lstStudent = new ArrayList<Student>();
	}

	public String addStudent(Student student) {
		lstStudent.add(student);
		return "student Created Successfully...";
	}

	public Student searchStudentDAO(int sno) {
		Student objStudent = null;
		for (Student student : lstStudent) {
			if (student.getSno() == sno) {
				objStudent = student;
			}
		}
		return objStudent;
	}

	public List<Student> showStudentDAO() {
		return lstStudent;
	}

	public String updateStudentDAO(Student objStudent) {
		Student student = searchStudentDAO(objStudent.getSno());
		if (student != null) {
			for (Student s : lstStudent) {
				if (s.getSno() == objStudent.getSno()) {
					s.setName(objStudent.getName());
					s.setCity(objStudent.getCity());
					s.setCgp(objStudent.getCgp());

				}
			}
			return "Record Updated...";
		} else {
			return "Student No Not Found...";
		}
	}

	public String deleteStudentDAO(int sno) {
		Student student = searchStudentDAO(sno);
		if (student != null) {
			lstStudent.remove(student);
			return "Student Removed...";
		} else {
			return "Student No Not Found...";
		}

	}
}
