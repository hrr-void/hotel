package com.hotel.domain.reservation;

import com.hotel.domain.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
@Service
public class ScheduleAReservation {
    
    @Autowired
    private CustomerRepository customerRepo;
    
    @Autowired
    private ReservationRepository reservationRepo;
    
    public ReservationDetails schedule(ReservationData data){
        var customer = customerRepo.findById(data.customerId()).get();
        var reservation = new Reservation(null, data.reservationDate(), 
                data.reservationEnd(), data.cost(), data.methodOfPayment(), 
                customer);
        reservationRepo.save(reservation);
        return new ReservationDetails(reservation);
    }
    
}
