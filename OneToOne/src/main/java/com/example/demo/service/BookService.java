package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;

public interface  BookService {
	
	

    public Book saveBook(Book book);
    public Book findByBookId(int bookId);

}
