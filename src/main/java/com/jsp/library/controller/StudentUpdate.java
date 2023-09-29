package com.jsp.library.controller;

import com.jsp.library.dto.Student;
import com.jsp.library.service.StudentService;

public class StudentUpdate {
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		Student s1 = studentService.updateStudentMailById(2, "s02@mail.com");
		
		if(s1!=null) {
			System.out.println("student "+ s1.getId()+" updated");
		}
		else {
			System.out.println("not updated");
		}
	}

}
