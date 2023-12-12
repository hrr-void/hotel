package com.hotel.domain.reservation;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
public record ReservationData(
        Long id,
        @NotNull
        @Future
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        LocalDateTime reservationDate,
        @NotNull
        @Future
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        LocalDateTime reservationEnd,
        int cost,
        String methodOfPayment,
        @NotNull
        Long customerId) {

}
