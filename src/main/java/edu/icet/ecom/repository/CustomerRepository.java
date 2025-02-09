package edu.icet.ecom.repository;

import edu.icet.ecom.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
