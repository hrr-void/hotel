package com.hotel.domain.customer;

import com.hotel.domain.address.AddressData;
import jakarta.validation.constraints.NotNull;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
public record CustomerUpdateData(
        @NotNull
        Long id, 
        String name, 
        String lastName,
        String email, 
        String phone,
        AddressData address) {
    
}
