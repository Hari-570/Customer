package com.org.hcl.controller;

import com.org.hcl.model.Customer;
import com.org.hcl.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/create")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }
}
