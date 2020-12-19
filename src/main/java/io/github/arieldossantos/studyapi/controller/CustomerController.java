package io.github.arieldossantos.studyapi.controller;

import io.github.arieldossantos.studyapi.model.Customer;
import io.github.arieldossantos.studyapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> listAll() {
        return customerRepository.findAll();
    }
}
