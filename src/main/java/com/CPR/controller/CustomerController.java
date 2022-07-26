package com.CPR.controller;

import com.CPR.model.Customer;
import com.CPR.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "cprdb/customers")
@RestController
public class CustomerController
{
    @GetMapping
    public List<Customer> getAll()
    {
        return customerService.getAll();
    }

    @GetMapping(path = "id/{id}")
    public Optional<Customer> getBy(@PathVariable("id") Long id)
    {
        return customerService.getBy(id);
    }

    @Autowired
    private CustomerService customerService;
}
