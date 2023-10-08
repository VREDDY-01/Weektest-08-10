package com.vishnu.Weektest.service;

import com.vishnu.Weektest.model.Book;
import com.vishnu.Weektest.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
	@Autowired
	BookRepo bookRepo;

	public String addBook(Book book) {
		bookRepo.save(book);
		return "saved";
	}

	public List<Book> getBooks() {
		return bookRepo.findAll();
	}

	public String updateBook(String id, Book book) {
		book.setID(id);
		bookRepo.save(book);
		return "updated";
	}

	public String delBook(String id) {
		bookRepo.deleteById(id);
		return "deleted";
	}
}
