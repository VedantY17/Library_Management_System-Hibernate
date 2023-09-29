package com.jsp.library.service;

import java.util.List;

import com.jsp.library.dao.StudentDao;
import com.jsp.library.dto.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();

	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	public boolean deleteStudentById(int id) {
		return studentDao.deleteStudentById(id);
	}

	public Student updateStudentMailById(int id, String newmail) {
		Student student = getStudentById(id);
		if (student != null) {
			return studentDao.updateStudentMailById(id, newmail);
		}
		return null;
	}

	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

}
