package com.jsp.library.controller;

import java.util.List;

import com.jsp.library.dto.Student;
import com.jsp.library.service.StudentService;

public class StudentGetAll {
	public static void main(String[] args) {

		StudentService studentService = new StudentService();
		List<Student> students = studentService.getAllStudents();

		for (Student s : students) {
			System.out.println("====================");
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println("====================");
		}
	}

}
