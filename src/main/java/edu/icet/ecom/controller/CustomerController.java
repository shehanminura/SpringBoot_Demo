package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService service;

    @GetMapping
    public List<Customer> getCustomer(){
       return service.getCustomer();
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer){
        service.add(customer);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        service.deleteStudentById(id);
    }
    @PutMapping
    public void updateCustomer(@RequestBody Customer customer){
        service.add(customer);
    }
}
