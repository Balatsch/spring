package com.balatsch.shoppingCart.repositories;

import com.balatsch.shoppingCart.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
