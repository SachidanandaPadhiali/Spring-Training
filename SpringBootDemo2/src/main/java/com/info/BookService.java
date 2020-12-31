package com.info;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookRepository repo;
	
	public List<Book> getAllBooks()
	{
		List<Book> bk = repo.findAll();
		
		return bk;
		
	}

}
