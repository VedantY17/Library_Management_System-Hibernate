package com.jsp.library.service;

import java.util.List;

import com.jsp.library.dao.BookDao;
import com.jsp.library.dao.StudentDao;
import com.jsp.library.dto.Book;
import com.jsp.library.dto.Student;

public class BookService {

	BookDao bookDao = new BookDao();

	public Book saveBook(Book book) {
		book.setStatus("Avaliable");
		return bookDao.saveBook(book);
	}

	public boolean deleteBookById(int id) {
		return bookDao.deleteBookById(id);
	}

	public Book updateBookNameById(int id, String newname) {
		Book book = getBookById(id);
		if (book != null) {
			return bookDao.updateBookNameById(id, newname);
		}
		return null;
	}

	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	public boolean requestBook(int bookid, int studid) {

		Book book = bookDao.getBookById(bookid);
		StudentDao studentDao = new StudentDao();
		Student student = studentDao.getStudentById(studid);

		if (book.getStatus().equals("Avaliable")) {
			book.setStatus("in request");
			book.setStudent(student);
			return bookDao.issue(book);
		}
		return false;

	}

}
