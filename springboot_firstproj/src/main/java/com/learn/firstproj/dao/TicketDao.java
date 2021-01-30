package com.learn.firstproj.dao;

import org.springframework.data.repository.CrudRepository;

import com.learn.firstproj.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
