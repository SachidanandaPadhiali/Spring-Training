package com.info;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	BookService service;
	@RequestMapping("/book")
	public List<Book> getAllBooks()
	{
		List<Book> bk = service.getAllBooks();
		return bk;
		
	}
}
