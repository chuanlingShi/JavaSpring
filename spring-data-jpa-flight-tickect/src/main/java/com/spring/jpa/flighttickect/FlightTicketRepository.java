package com.spring.jpa.flighttickect;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightTicketRepository extends JpaRepository<FlightTicket, Integer> {
    List<FlightTicket> findByOriginAndDestination(String origin, String destination);

    List<FlightTicket> findByFareIsLessThan(double fare);

}
