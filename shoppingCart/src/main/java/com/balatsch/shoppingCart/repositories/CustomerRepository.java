package com.balatsch.shoppingCart.repositories;

import com.balatsch.shoppingCart.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
