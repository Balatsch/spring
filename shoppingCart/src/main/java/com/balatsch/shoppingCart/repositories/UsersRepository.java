package com.balatsch.shoppingCart.repositories;

import com.balatsch.shoppingCart.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Long> {
}
