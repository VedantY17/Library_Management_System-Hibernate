package com.jsp.library.controller;

import com.jsp.library.dto.Student;
import com.jsp.library.service.StudentService;

public class StudentGet {
	public static void main(String[] args) {

		StudentService studentService = new StudentService();
		Student student = studentService.getStudentById(2);

		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getEmail());
		System.out.println("====================");

	}

}
