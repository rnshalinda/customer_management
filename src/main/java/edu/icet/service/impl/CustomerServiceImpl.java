package edu.icet.service.impl;

import edu.icet.model.Customer;
import edu.icet.repository.CustomerRepository;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository repository;

    @Override
    public Customer findById(String id) {
        return repository.findById(id).get();

    }

    @Override
    public List<Customer> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public void addCustomer(Customer customer) {
        repository.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }


}
