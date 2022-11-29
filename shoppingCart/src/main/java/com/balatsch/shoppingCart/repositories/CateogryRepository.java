package com.balatsch.shoppingCart.repositories;

import com.balatsch.shoppingCart.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CateogryRepository extends JpaRepository<Category,Long> {
}
