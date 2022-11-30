package com.balatsch.shoppingCart.Services;

import com.balatsch.shoppingCart.entities.Book;

import java.util.List;

public interface BookService {
    public Book createBook(Book book);
    public void deleteBook(Book book);
    public List<Book> getBooks();
}
