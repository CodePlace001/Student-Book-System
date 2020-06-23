package com.hq.service;

import java.util.List;

import com.hq.bean.Books;

public interface BookService {
	
	public List<Books> selectAllBooks();

	void addBook(Books book);

}
