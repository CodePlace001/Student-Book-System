package com.hq.serviceimpl;

import java.util.List;

import com.hq.bean.Books;
import com.hq.daoimpl.BookDaoImpl;
import com.hq.service.BookService;

public class BookServiceImpl implements BookService {
	private BookDaoImpl bookDao = new BookDaoImpl();

	@Override
	public List<Books> selectAllBooks() {
		// TODO Auto-generated method stub
		return bookDao.selectAllBooks();
	}

	//ÃÌº” ÈºÆ
	@Override
	public void addBook(Books book) {
		// TODO Auto-generated method stub
		bookDao.insertBook(book);
		
	}

	
}
