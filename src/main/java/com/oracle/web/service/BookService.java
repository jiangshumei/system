package com.oracle.web.service;

import java.util.List;

import com.oracle.web.bean.Book;

public interface BookService {

	int save(Book book);

	List<Book> list();

	Book queryOneBook(Integer id);

	void update(Book book);

}
