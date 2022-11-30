package com.balatsch.shoppingCart.Services;

import com.balatsch.shoppingCart.entities.Book;

import java.math.BigDecimal;
import java.util.Map;

public interface CartService {
    public void addBook(Book book);
    public void removeBook(Book book);
    public void clearCart();
    public void changeQuantity(Book book ,Integer quantity);
    public Map<Book,Integer> getCart();
    public int getTotalQuantity();
    public BigDecimal getTotalAmount();
}
