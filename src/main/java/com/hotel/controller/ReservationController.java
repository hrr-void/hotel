package com.hotel.controller;

import com.hotel.domain.reservation.ReservationData;
import com.hotel.domain.reservation.ScheduleAReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
@RestController
@ResponseBody
@RequestMapping("/reservations")
public class ReservationController {
    
    @Autowired
    private ScheduleAReservation service;
    
    @PostMapping
    @Transactional
    public ResponseEntity schedule(@RequestBody ReservationData data){
        var response = service.schedule(data);
        return ResponseEntity.ok(response);
    }
}
