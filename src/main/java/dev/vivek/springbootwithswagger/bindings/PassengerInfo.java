package dev.vivek.springbootwithswagger.bindings;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class PassengerInfo {
    private String fname;
    private String lname;
    private String from;
    private String to;
    private String journeyDate;
    private String flightId;
}
