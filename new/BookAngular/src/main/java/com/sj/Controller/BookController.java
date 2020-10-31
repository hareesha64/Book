package com.sj.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.Model.Book;
import com.sj.service.BookService;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="http://localhost:4200")
public class BookController {
	
	
	
		@Autowired
		BookService service;
		@GetMapping("/hitest")
		public String sayhello()
		{
			return ("Hello");
		}
		
		@GetMapping("/books")
		public List<Book> getBooks()
		{
			System.out.println("hi");
			return service.getAllbooks();
		}
		@GetMapping("/books/{id}")
		public Book getBookById(@PathVariable int id) {
			return service.bookById(id);
			
		}
		@PostMapping("/books/")
		public Book insertMovie(@RequestBody Book b)
		{
			return service.createBook(b);
		}
		@PutMapping("/update/")
		/*public Book UpdateBook(@RequestBody Book b)
		{
			return service.updateBook(m);
		}*/
		@DeleteMapping("/delete/{id}")
		public void deleteBook(@PathVariable int id)
		{
			service.deleteBook(id);
		}
	}



