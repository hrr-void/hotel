package com.hotel.service;

import com.hotel.model.Customer;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
@Service
public class CustomerService implements ICustomerService{

    @Override
    public Customer create(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customer update(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customer findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Customer> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customer delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
