package com.vishnu.Weektest.controller;

import com.vishnu.Weektest.model.Book;
import com.vishnu.Weektest.model.Laptop;
import com.vishnu.Weektest.service.BookService;
import com.vishnu.Weektest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
	@Autowired
	BookService bookService;

	@PostMapping("book")
	public String addBook(@RequestBody Book book){
		return bookService.addBook(book);
	}
	@GetMapping("book")
	public List<Book> getBooks(){
		return bookService.getBooks();
	}
	@PutMapping("book/{id}")
	public String updateBook(@PathVariable String id,@RequestBody Book book){
		return bookService.updateBook(id,book);
	}
	@DeleteMapping("book/{id}")
	public String delBook(@PathVariable String id){
		return bookService.delBook(id);
	}
}
