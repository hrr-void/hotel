package com.hotel.domain.reservation;

import java.time.LocalDateTime;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
public record ReservationDetails(Long id, LocalDateTime reservationDate, LocalDateTime reservationEnd, int cost, String methodOfPayment, Long customerId) {
    
    public ReservationDetails(Reservation reservation){
        this(reservation.getId(), reservation.getReservationDate(), 
                reservation.getReservationEnd(), reservation.getCost(), 
                reservation.getMethodOfPayment(), reservation.getCustomer().getId());
    }
    
}
