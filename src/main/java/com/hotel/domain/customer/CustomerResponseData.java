package com.hotel.domain.customer;

import com.hotel.domain.address.AddressData;
import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
public record CustomerResponseData(
        @NotBlank
        Long id, 
        String name, 
        String lastName,
        String email, 
        String phone, 
        AddressData address) {
    
}
