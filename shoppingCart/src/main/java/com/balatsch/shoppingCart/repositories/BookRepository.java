package com.balatsch.shoppingCart.repositories;

import com.balatsch.shoppingCart.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
