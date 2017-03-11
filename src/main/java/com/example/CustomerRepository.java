package com.example;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ELAHI on 3/4/2017.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
