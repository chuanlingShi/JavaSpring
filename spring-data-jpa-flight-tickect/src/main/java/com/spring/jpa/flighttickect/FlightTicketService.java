package com.spring.jpa.flighttickect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FlightTicketService {
    @Autowired
    FlightTicketRepository repository;

    public void addFlightTickets() {
        List<FlightTicket> tickets = new ArrayList<>();

        tickets.add(new FlightTicket(101, "New York", "Los Angeles", 350.0));
        tickets.add(new FlightTicket(202, "London", "Tokyo", 800.0));
        tickets.add(new FlightTicket(303, "Paris", "Dubai", 600.0));
        tickets.add(new FlightTicket(404, "Sydney", "Singapore", 450.0));
        tickets.add(new FlightTicket(505, "Berlin", "Rome", 250.0));

        repository.saveAll(tickets);
    }
    public void findByOriginAndDestination(String origin, String destination) {
        repository.findByOriginAndDestination(origin, destination).forEach(System.out::println);
    }

    public void findByFareIsLessThan(double fare){
        repository.findByFareIsLessThan(fare).forEach(System.out::println);
    }
}
