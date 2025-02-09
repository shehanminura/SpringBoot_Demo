package edu.icet.ecom.service.Impl;

import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.repository.CustomerRepository;
import edu.icet.ecom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository repository;


    @Override
    public void add(Customer customer) {
        repository.save(customer);
    }

    @Override
    public List<Customer> getCustomer() {
        List<Customer>all  =repository.findAll();
        return all;
    }
}
