package com.capibytes.datalytics.domain.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Transactional
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Transactional
    public Customer save(Customer customer){
        return customerRepository.save(consultant);
    }

    @Transactional
    public void delete(Customer customer){
        customerRepository.delete(customer);

    }

    public Optional<Customer> findById(Long id){
        return customerRepository.findById(id);
    }
}
