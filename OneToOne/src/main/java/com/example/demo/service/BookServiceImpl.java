package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.BookRepository;
import com.example.demo.entity.Book;
import com.example.demo.entity.Story;
@Service
public class BookServiceImpl implements BookService{

	@Autowired
    private BookRepository bookRepository;
    public Book saveBook(Book book) {
        Story story = book.getStory();
        story.setBook(book);
        book = bookRepository.save(book);
        return book;
    }
    public Book findByBookId(int bookId) {
        Book book = bookRepository.findByBookId(bookId);
        return book;
}
}
