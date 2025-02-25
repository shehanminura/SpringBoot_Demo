package edu.icet.ecom.service;

import edu.icet.ecom.dto.Customer;

import java.util.List;

public interface CustomerService  {

    void add(Customer customer);

    List<Customer> getCustomer();

    void deleteStudentById(Integer id);

    List<Customer> findByName(String name);
}
