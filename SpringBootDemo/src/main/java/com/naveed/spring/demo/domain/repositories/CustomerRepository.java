/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.spring.demo.domain.repositories;

import com.naveed.spring.demo.domain.entities.Customer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author nmrehman
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
