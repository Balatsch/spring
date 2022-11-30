package com.balatsch.shoppingCart.Services;

import com.balatsch.shoppingCart.entities.Book;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
public class CartServiceImp implements CartService {
    private Map<Book, Integer> cart = new HashMap<>();

    @Override
    public void addBook(Book book) {
        if (cart.containsKey(book)) {
            Integer quantity = cart.get(book) + 1;
            cart.put(book, quantity);
        } else {
            cart.put(book, 1);
        }
    }

    @Override
    public void removeBook(Book book) {
        cart.remove(book);
    }

    @Override
    public void clearCart() {
        cart.clear();
    }

    @Override
    public void changeQuantity(Book book, Integer quantity) {
        cart.put(book, quantity);
    }

    @Override
    public Map<Book, Integer> getCart() {
        return cart;
    }

    @Override
    public int getTotalQuantity() {
        int total = 0;
        cart.values().stream().mapToInt(Integer::intValue).sum();
        return total;
    }

    @Override
    public BigDecimal getTotalAmount() {
        double total = 0.0f;
        total = cart.entrySet().stream().map(bookIntegerEntry -> bookIntegerEntry.getKey().getPrice().doubleValue() * bookIntegerEntry.getValue()).mapToDouble(value -> value).sum();
        return BigDecimal.valueOf(total);
    }

}
