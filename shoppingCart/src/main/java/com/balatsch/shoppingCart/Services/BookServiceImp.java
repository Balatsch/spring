package com.balatsch.shoppingCart.Services;

import com.balatsch.shoppingCart.entities.Book;
import com.balatsch.shoppingCart.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImp implements BookService{
    @Autowired
    BookRepository bookRepository;
    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
