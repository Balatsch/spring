package com.balatsch.shoppingCart.repositories;

import com.balatsch.shoppingCart.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
