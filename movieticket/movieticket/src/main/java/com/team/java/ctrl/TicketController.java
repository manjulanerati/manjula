package com.team.java.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.team.java.service.ShowService;
@RestController
public class TicketController {
	@Autowired
	 ShowService  ticketService;
	@PostMapping("/tickets")
	public Ticket addTicket(@RequestBody Ticket ticket)
	{
		return ticketService.addTicket(ticket);
	}
@GetMapping("/tickets")
public List<Ticket> getTicket(){
	return showTicket.getTicket();
}
@DeleteMapping("/tickets")
public boolean deleteAllTickets()
{
	return ticketService.deleteAllTickets();
	
}
@PutMapping("/tickets")
public Ticket updateTicket(@PathVariable int ticketId, @RequestBody Ticket obj) {
	return ticketService.updateTicket(ticketId,obj);
	
}
}
