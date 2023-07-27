package com.spring.jpa.flighttickect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FlightTicketJpaMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(FlightTicketJpaConfig.class);
        FlightTicketService service = configApplicationContext.getBean(FlightTicketService.class);

//        service.addFlightTickets();
        service.findByFareIsLessThan(500);
        service.findByOriginAndDestination("New York", "Los Angeles");
        configApplicationContext.close();
    }
}
