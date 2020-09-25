package com.example.airlinebooking;

import com.example.airlinebooking.model.TicketDetails;
import com.example.airlinebooking.services.TicketService;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class TicketTest {

    TicketDetails ticketDetails;

    @Autowired
    TicketService ticketService = new TicketService();

    @BeforeEach
    public void setup(){
        ticketDetails = new TicketDetails("T123","PA1010101010","Full Name","A123","26/09/2020","On Target");
    }

    @Test
    public void addTicket(){
        ticketService.saveTicket(ticketDetails);
        TicketDetails ticketDetails1 = ticketService.findTicketByID(ticketDetails.getTicketID());

        assertEquals(ticketDetails.getTicketID(),ticketDetails1.getTicketID());
    }
}
