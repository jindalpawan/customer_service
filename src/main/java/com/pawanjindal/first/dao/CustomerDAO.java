package com.pawanjindal.first.dao;

import com.pawanjindal.first.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer > {

    @Override
    List<Customer> findAll();
    //findall() func should return list<customer> not the iteratable list

}
