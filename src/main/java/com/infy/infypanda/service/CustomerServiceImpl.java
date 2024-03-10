package com.infy.infypanda.service;

import com.infy.infypanda.dto.CustomerDTO;
import com.infy.infypanda.entity.CustomerEntity;
import com.infy.infypanda.exception.InfypandaException;
import com.infy.infypanda.repository.CustomerRepository;
import com.infy.infypanda.utility.CustomerConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Integer register(CustomerDTO customerDTO) throws InfypandaException {
        CustomerEntity customerEntity = CustomerConverter.toEntity(customerDTO);
        CustomerEntity saveCustomer;
        try {
            saveCustomer = customerRepository.save(customerEntity);
        } catch (Exception exception) {
            throw new InfypandaException("Mobile number or Email id already exists");
        }

        return saveCustomer.getId();
    }
}
