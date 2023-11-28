package com.hotel.domain.customer;

import com.hotel.domain.address.Address;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
@Getter
@Entity(name = "Customer")
@Table(name = "customers")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    @Embedded
    private Address address;
    
    public Customer(CustomerCreationData customerCreationData){
        this.name = customerCreationData.name();
        this.lastName = customerCreationData.lastName();
        this.email = customerCreationData.email();
        this.phone = customerCreationData.phone();
        this.address = new Address(customerCreationData.address());
    }
    
    public Object updateData(CustomerUpdateData updateCustomerData){
        if(updateCustomerData.name() != null){
            this.name = updateCustomerData.name();
        }
        if(updateCustomerData.lastName() != null){
            this.lastName = updateCustomerData.lastName();
        }
        if(updateCustomerData.email() != null){
            this.email = updateCustomerData.email();
        }
        if(updateCustomerData.phone() != null){
            this.phone = updateCustomerData.phone();
        } 
        if(updateCustomerData.address() != null){
            this.address = address.updateAddress(updateCustomerData.address());
        }
        return updateCustomerData;
    }
    
}
