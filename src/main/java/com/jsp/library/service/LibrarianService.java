package com.jsp.library.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.library.dao.BookDao;
import com.jsp.library.dao.LibrarianDao;
import com.jsp.library.dao.StudentDao;
import com.jsp.library.dto.Book;
import com.jsp.library.dto.Librarian;
import com.jsp.library.dto.Student;

public class LibrarianService {

	LibrarianDao librarianDao = new LibrarianDao();

	BookDao bookDao = new BookDao();
	StudentDao studentDao = new StudentDao();

	public Librarian saveLibrarian(Librarian librarian) {
		librarian.setStatus("Unapproved");
		return librarianDao.saveLibrarian(librarian);
	}

	public Librarian deleteLibrarianById(int id) {
		Librarian librarian = getLibrarianById(id);
		if (librarian != null) {
			return librarianDao.deleteLibrarianById(id);
		}
		return null;
	}

	public Librarian updateLibrarianMailById(int id, String newmail) {
		Librarian librarian = getLibrarianById(id);
		if (librarian != null) {
			return librarianDao.updateLibrarianMailById(id, newmail);
		}
		return null;
	}

	public Librarian getLibrarianById(int id) {
		return librarianDao.getLibrarianById(id);
	}

	public List<Librarian> getAllLibrarians() {
		return librarianDao.getAllLibrarians();
	}

	public Book addBook(Book book) {
		BookDao bookDao = new BookDao();
		book.setStatus("Available");
		bookDao.saveBook(book);
		return book;
	}

	public boolean removeBookById(int bookid) {
		BookDao bookDao = new BookDao();
		boolean res = bookDao.deleteBookById(bookid);
		return res;
	}

	public boolean issueBookById(int bookid, int libid, int studid) {
		Book book = bookDao.getBookById(bookid);
		Student student = studentDao.getStudentById(studid);
		Librarian librarian = librarianDao.getLibrarianById(libid);

		if (librarian != null && book != null && student != null
				&& librarian.getStatus().equalsIgnoreCase("approved")) {

			if (!book.getStatus().equals("Issued")) {
				book.setStatus("Issued");
				book.setStudent(student);
				book.setLibrarian(librarian);
			} else {
				book.setStatus("Unavailable");
			}
			return bookDao.issue(book);
		}
		return false;

	}

	public boolean returnBookById(int bookid) {
		Book book = bookDao.getBookById(bookid);
		if (book != null && book.getStatus().equals("Issued")) {
			Student student = book.getStudent();
			Librarian librarian = book.getLibrarian();

			if (student != null && librarian != null) {
				book.setStatus("Available");
				book.setStudent(null);
				book.setLibrarian(null);
				return bookDao.returnBook(book);
			}
		}
		return false;
	}

	public List<Book> viewAllInRequestBooks() {

		BookService bookService = new BookService();
		List<Book> books = bookService.getAllBooks();
		List<Book> inrequestBooks = new ArrayList<Book>();

		for (Book b : books) {
			if (b.getStatus().equals("in request")) {
				inrequestBooks.add(b);
			}

		}
		return inrequestBooks;

	}

	public boolean issueInRequestBooksById(int bookid, int libid) {

		Librarian librarian = librarianDao.getLibrarianById(libid);
		Book book = bookDao.getBookById(bookid);

		if (book.getStatus().equals("in request") && librarian != null) {
			book.setStatus("Issued");
			book.setLibrarian(librarian);
			return bookDao.issue(book);
		}
		return false;
	}

}
