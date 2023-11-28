package com.hotel.domain.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    
    private String city;    
    private String neighborhood;
    private String street;
    private int number;
    
    public Address(AddressData address){
        this.street = address.street();
        this.number = address.number();
        this.city = address.city();
        this.neighborhood = address.neighborhood();
    }
    
    public Address updateAddress(AddressData address){
        this.street = address.street();
        this.number = address.number();
        this.city = address.city();
        this.neighborhood = address.neighborhood();
        return this;
    }

}
