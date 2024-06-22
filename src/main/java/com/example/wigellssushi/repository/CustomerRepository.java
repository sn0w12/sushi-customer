package com.example.wigellssushi.repository;

import com.example.wigellssushi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
