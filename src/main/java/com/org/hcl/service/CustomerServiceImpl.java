package com.org.hcl.service;

import com.org.hcl.model.Customer;
import com.org.hcl.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepo customerRepo;

    @Override
    public void addCustomer(Customer customer) {
        customerRepo.save(customer);
    }
}
