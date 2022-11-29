package com.balatsch.shoppingCart.repositories;

import com.balatsch.shoppingCart.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long> {
}
