package com.sj.service;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.Model.Book;
import com.sj.repository.BookRepository;
@Service
public class BookService {
	@Autowired
	BookRepository dao;

	public Book bookById(int id)
	{
		Optional<Book> book=dao.findById(id);
		return book.get();
	}
	public List<Book> getAllbooks()
	{
		return dao.findAll();
	}
	public Book createBook(Book book)
	{
		return dao.save(book);
	}
	/*public Book updateBook(Book book)
	{
		return dao.updateBook(book);
	}*/
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}
	 
}
