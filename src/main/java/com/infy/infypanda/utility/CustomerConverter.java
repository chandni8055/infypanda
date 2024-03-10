package com.infy.infypanda.utility;

import com.infy.infypanda.dto.CustomerDTO;
import com.infy.infypanda.entity.CustomerEntity;

public class CustomerConverter {
    public static CustomerDTO toDto(CustomerEntity customerEntity){
        CustomerDTO customerDTO = new CustomerDTO();
        if(null != customerEntity.getId()) {
            customerDTO.setId(customerEntity.getId());
        }

        customerDTO.setName(customerEntity.getName());
        customerDTO.setMobileNumber(customerEntity.getMobileNumber());
        customerDTO.setEmail(customerEntity.getEmail());
        customerDTO.setPassword(customerEntity.getPassword());

        return customerDTO;
    }

    public static CustomerEntity toEntity(CustomerDTO customerDTO){
        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setId(customerDTO.getId());
        customerEntity.setName(customerDTO.getName());
        customerEntity.setMobileNumber(customerDTO.getMobileNumber());
        customerEntity.setEmail(customerDTO.getEmail());
        customerEntity.setPassword(customerDTO.getPassword());


        return customerEntity;
    }
}
