package com.test.repositry;


import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Book;

public interface BookRepositry extends JpaRepository<Book, Integer> {
	
}
