package com.jsp.library.controller;

import com.jsp.library.service.StudentService;

public class StudentDelete {
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();

		boolean res = studentService.deleteStudentById(0);
		if (res == true) {
			System.out.println("student deleted");
		} else {
			System.out.println("student not deleted");
		}
	}

}
