package com.sj.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sj.Model.Book;





public interface BookRepository extends JpaRepository<Book, Integer>{
	public Book findById(Book book);
	public List<Book> findAll();
	public Book save(Book book);
	public void deleteById(int id);
	
	

}
