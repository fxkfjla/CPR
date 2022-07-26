package com.CPR.service;

import com.CPR.model.Customer;
import com.CPR.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService
{
    public List<Customer> getAll()
    {
       return customerRepository.findAll();
    }

    public Optional<Customer> getBy(Long id)
    {
        return customerRepository.findById(id);
    }

    @Autowired
    private CustomerRepository customerRepository;
}
