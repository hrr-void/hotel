package com.hotel.service;

import com.hotel.model.Customer;
import java.util.List;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
public interface ICustomerService {
    
    Customer create(Customer customer);
    Customer update(Customer customer);
    Customer findById(Long id);
    List<Customer> findAll();
    Customer delete(Long id);
    
}
