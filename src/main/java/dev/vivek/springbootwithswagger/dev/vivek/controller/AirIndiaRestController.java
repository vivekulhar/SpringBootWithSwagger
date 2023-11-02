package dev.vivek.springbootwithswagger.dev.vivek.controller;

import dev.vivek.springbootwithswagger.bindings.PassengerInfo;
import dev.vivek.springbootwithswagger.bindings.TicketInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirIndiaRestController {

    @PostMapping(value = "/bookTicket",
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"})
    public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passengerInfo){
        TicketInfo ticketInfo = new TicketInfo();
        ticketInfo.setName(passengerInfo.getFname() + " " + passengerInfo.getLname());
        ticketInfo.setFrom(passengerInfo.getFrom());
        ticketInfo.setTo(passengerInfo.getTo());
        ticketInfo.setJourneyDate(passengerInfo.getJourneyDate());
        ticketInfo.setFlightId(passengerInfo.getFlightId());
        ticketInfo.setTicketPrice("5000");
        ticketInfo.setTicketStatus("Confirmed");

        return new ResponseEntity<>(ticketInfo, HttpStatus.CREATED);
    }
}
