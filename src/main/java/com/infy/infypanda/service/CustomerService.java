package com.infy.infypanda.service;

import com.infy.infypanda.dto.CustomerDTO;
import com.infy.infypanda.exception.InfypandaException;

public interface CustomerService {
    Integer register(CustomerDTO customerDTO) throws InfypandaException;
}
