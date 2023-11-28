package com.hotel.domain.customer;

import com.hotel.domain.address.AddressData;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
public record CustomerCreationData(
        @NotBlank
        String name, 
        @NotBlank
        String lastName,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String phone, 
        @NotNull
        AddressData address) {
    
}
