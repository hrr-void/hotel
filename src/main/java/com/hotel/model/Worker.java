package com.hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Raul Verduzco Cruz <ztr4w at nephewbob>
 */
@Entity
@Table(name = "workers")
public class Worker {
    
    @Id
    private Long id;
}
