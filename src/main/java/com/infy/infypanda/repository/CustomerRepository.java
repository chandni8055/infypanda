package com.infy.infypanda.repository;

import com.infy.infypanda.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

    public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {

        Optional<CustomerEntity> findByMobileNumber(Long mobileNumber);
    }

