package com.hotel.repository;

import com.hotel.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
