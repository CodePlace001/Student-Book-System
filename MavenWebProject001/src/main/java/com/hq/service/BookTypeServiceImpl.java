package com.hq.service;

import java.util.List;

import com.hq.bean.BookType;
import com.hq.daoimpl.BookTypeDaoImpl;

public class BookTypeServiceImpl implements BookTypeService{
	private BookTypeDaoImpl bookTypeDao = new BookTypeDaoImpl();

	@Override
	public List<BookType> selectBookType() {
		// TODO Auto-generated method stub
		return bookTypeDao.selectBookType();
	}

}
