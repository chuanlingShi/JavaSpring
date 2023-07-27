package com.spring.jpa.flighttickect;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table
public class FlightTicket {
    @Id
    private int flightNum;
    @Column
    private String origin;
    @Column
    private String destination;
    @Column
    private double fare;


}
