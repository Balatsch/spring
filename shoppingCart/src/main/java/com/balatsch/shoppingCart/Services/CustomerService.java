package com.balatsch.shoppingCart.Services;

import com.balatsch.shoppingCart.entities.Customer;

import java.util.List;

public interface CustomerService {
    public Customer createCustomer(Customer customer);
    public void deleteCustomer(Customer customer);
    public List<Customer> getCustomers();
}
