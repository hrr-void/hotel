package com.hotel.domain.address;

import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
public record AddressData(
        @NotBlank
        String city, 
        @NotBlank
        String neighborhood, 
        @NotBlank
        String street, 
        @NotBlank
        int number) {
    
}
