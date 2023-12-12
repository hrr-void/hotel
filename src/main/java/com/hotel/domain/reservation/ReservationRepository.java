package com.hotel.domain.reservation;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    
}
