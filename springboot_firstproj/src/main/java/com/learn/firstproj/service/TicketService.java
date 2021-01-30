package com.learn.firstproj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.firstproj.dao.TicketDao;
import com.learn.firstproj.model.Ticket;

@Service
public class TicketService {
	@Autowired
	private TicketDao ticketDao;

	public String bookTickets(List<Ticket> tickets) {
		List<Ticket> savedTicket = new ArrayList<>();

		ticketDao.saveAll(tickets).forEach(savedTicket::add);
		return "Saved User Ids are " + savedTicket.stream().map(t -> t.getId()).collect(Collectors.toList());
	}

	public List<Ticket> getTickets() {
		return (List<Ticket>) ticketDao.findAll();

	}

	public Ticket getTicketbyId(int ticketid) {
		// Optional<Ticket> result = ticketDao.findById(ticketid);//.orElse(null);

		return ticketDao.findById(ticketid).orElse(null);
		// return ticket;

	}

	public Ticket updateTicket(int ticketid, Ticket ticket) {
		
		Ticket ticketidfromDB = ticketDao.findById(ticketid).orElse(null);
		if(ticketidfromDB != null) {
			ticketidfromDB.setAmount(ticket.getAmount());
			ticketidfromDB.setCategory(ticket.getCategory());
			ticketDao.save(ticketidfromDB);
			
			return ticketidfromDB;
		}
		
		return null;
	}

	public String deleteTicket(int ticketid) {
		Ticket ticketidfromDB = ticketDao.findById(ticketid).orElse(null);
		if(ticketidfromDB != null)
		{
			ticketDao.deleteById(ticketid);
			return "Ticket deleted with id"+ticketid;
		}
		return "Id not available to delete";
	}

}
