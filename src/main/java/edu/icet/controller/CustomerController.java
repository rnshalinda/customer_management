package edu.icet.controller;

import edu.icet.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

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
}
