package com.test.dao.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.test.dao.BookDao;
import com.test.entity.Book;
import com.test.repositry.BookRepositry;

@Repository
public class BookDaoImpl implements BookDao {
	
	@Autowired
	private BookRepositry repositry;
	
	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return repositry.save(book);
		
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return repositry.save(book);
	}

	@Override
	public Optional<Book> getBookById(int id) {
		// TODO Auto-generated method stub
		return repositry.findById(id);
	}

	@Override
	public List<Book> deleteBookById(int id) {
		// TODO Auto-generated method stub
		repositry.deleteById(id);
		return  repositry.findAll();
		}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return repositry.findAll();
	}
	
}
