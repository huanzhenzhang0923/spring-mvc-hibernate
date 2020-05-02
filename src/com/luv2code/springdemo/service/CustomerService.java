package com.luv2code.springdemo.service;

import com.luv2code.springdemo.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);
}
