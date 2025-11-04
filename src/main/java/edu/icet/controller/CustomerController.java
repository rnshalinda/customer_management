package edu.icet.controller;

import edu.icet.model.Customer;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;


    @GetMapping("/name")
    public String getName(){
        return  "NSR";
    }

    @GetMapping("/age")
    public int getAge(){
        return 18;
    }

    @GetMapping("/get-customer")
    public Customer getCustomer(){
        return new Customer(
                "1",
                "NSR",
                "Colombo",
                120000.00
        );
    }

    List<Customer> list = new ArrayList<>();

    @GetMapping("/all-customers")
    public List<Customer> getAll(){
        list.add( new Customer("1", "NSR", "Colombo", 12000.00));
        list.add( new Customer("1", "NSR", "Colombo", 12000.00));
        list.add( new Customer("1", "NSR", "Colombo", 12000.00));
        list.add( new Customer("1", "NSR", "Colombo", 12000.00));
        return list;
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }

    @GetMapping("/find-by-id/{id}")
    public Customer findByID(@PathVariable String id){
        return service.findById(id);
    }

    @GetMapping("/find-by-name/{name}")
    public List<Customer> findByName(@PathVariable String name){
        return service.findByName(name);
    }




}
