package com.hotel.controller;

import com.hotel.domain.address.AddressData;
import com.hotel.domain.customer.Customer;
import com.hotel.domain.customer.CustomerCreationData;
import com.hotel.domain.customer.CustomerData;
import com.hotel.domain.customer.CustomerRepository;
import com.hotel.domain.customer.CustomerResponseData;
import com.hotel.domain.customer.CustomerUpdateData;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {
    
    @Autowired
    private CustomerRepository customerRepo;
    
    @PostMapping
    public ResponseEntity create(@RequestBody @Valid CustomerCreationData customerCreationData){
        Customer customer = customerRepo.save(new Customer(customerCreationData));
        CustomerResponseData customerResponseData = new CustomerResponseData(
                customer.getId(), customer.getName(), customer.getLastName(), customer.getEmail(), 
                customer.getPhone(), new AddressData(
                        customer.getAddress().getCity(), 
                        customer.getAddress().getNeighborhood(), 
                        customer.getAddress().getStreet(), 
                        customer.getAddress().getNumber()));
        return ResponseEntity.ok(customerResponseData);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id){
        Customer customer = customerRepo.getReferenceById(id);
        var customerData = new CustomerData(customer.getId(), customer.getName(), 
                customer.getLastName(), customer.getEmail(), customer.getPhone(), 
                new AddressData(
                        customer.getAddress().getCity(), 
                        customer.getAddress().getNeighborhood(), 
                        customer.getAddress().getStreet(), 
                        customer.getAddress().getNumber()));
        return ResponseEntity.ok(customerData);
    }
    
    @GetMapping
    public ResponseEntity<List<Customer>> findAll(){
        return ResponseEntity.ok(customerRepo.findAll());
    }
    
    @PutMapping
    @Transactional
    public ResponseEntity update(@RequestBody @Valid CustomerUpdateData updateCustomerData){
        Customer customer = customerRepo.getReferenceById(updateCustomerData.id());
        customer.updateData(updateCustomerData);
        return ResponseEntity.ok(new CustomerResponseData(customer.getId(), 
                customer.getName(), customer.getLastName(), customer.getEmail(), customer.getPhone(), 
                new AddressData(customer.getAddress().getCity(), 
                        customer.getAddress().getNeighborhood(), 
                        customer.getAddress().getStreet(), 
                        customer.getAddress().getNumber())));
    }
    
    // Delete from database.
    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable("id") Long id){
        Customer customer = customerRepo.getReferenceById(id);
        customerRepo.delete(customer);
    }
}
