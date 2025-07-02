package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String Title){
        System.out.println("Adding Book via BookService " + Title);
        bookRepository.saveBook(Title);
    }
}
