package com.learn.firstproj.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.firstproj.model.Ticket;
import com.learn.firstproj.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@PostMapping("/bookTickets")
	public String bookTickets(@RequestBody List<Ticket> tickets) {

		return ticketService.bookTickets(tickets);
		// return "tickets booked" + tickets.size();
	}

	@GetMapping("/getTickets")
	public List<Ticket> getTickets() {
		List<Ticket> tickets = ticketService.getTickets();
		return tickets;
	}

	@GetMapping("/getTicket/{ticketid}")
	public Ticket getTicketbyId(@PathVariable  int ticketid) {
		return ticketService.getTicketbyId(ticketid);
	 
	}
	
	@PutMapping("/bookTickets/{ticketid}")
	public Ticket updateTicket(@PathVariable  int ticketid, @RequestBody  Ticket ticket) {
		return ticketService.updateTicket(ticketid, ticket);
		//return ticketService.bookTickets(tickets);
		
	}
	
	@DeleteMapping("/deleteTickets/{ticketid}")
	public String updateTicket(@PathVariable  int ticketid) {
		return ticketService.deleteTicket(ticketid);
		//return ticketService.bookTickets(tickets);
		
	}

	
}
