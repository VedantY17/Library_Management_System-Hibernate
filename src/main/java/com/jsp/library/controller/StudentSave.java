package com.jsp.library.controller;

import com.jsp.library.dto.Student;
import com.jsp.library.service.StudentService;

public class StudentSave {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		Student student = new Student();

		student.setName("stud2");
		student.setEmail("s2@mail.com");

		Student s2 = studentService.saveStudent(student);

		if (s2 != null) {
			System.out.println("Student " + s2.getId() + " details saved");
		}
	}

}
