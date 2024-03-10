package com.infy.infypanda.controller;

import com.infy.infypanda.dto.CustomerDTO;
import com.infy.infypanda.exception.InfypandaException;
import com.infy.infypanda.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/register")
    public ResponseEntity<Object>register(@RequestBody CustomerDTO customerDTO) throws InfypandaException {
        customerService.register(customerDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
