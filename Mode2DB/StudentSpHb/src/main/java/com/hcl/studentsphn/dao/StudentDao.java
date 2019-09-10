package com.hcl.studentsphn.dao;

import java.util.List;

import com.hcl.studentsphn.model.Student;

public interface StudentDao {
	
	public void addStudent(Student student);
	public List<Student> getStudent();
	public void updateStudent(Student student);

}
