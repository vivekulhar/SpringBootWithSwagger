package dev.vivek.springbootwithswagger.bindings;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class TicketInfo {
    private String name;
    private String from;
    private String to;
    private String journeyDate;
    private String flightId;
    private String ticketPrice;
    private String ticketStatus;
}
