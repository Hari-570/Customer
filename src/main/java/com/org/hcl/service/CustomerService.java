package com.org.hcl.service;

import com.org.hcl.model.Customer;
import org.springframework.web.bind.annotation.RequestBody;

public interface CustomerService {
    public void addCustomer(Customer customer);
}
