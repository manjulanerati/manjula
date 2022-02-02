package com.team.java.service;

import org.springframework.beans.factory.annotation.Autowired;
@Service
public class TicketService {
	@Autowired
	TicketRepositry TicketRepositry;

	 public Ticket createTicket(Ticket ticket) {
		 
		 return ticketRepositry.save(ticket);
		 
	 }
	 public List<Ticket>Ticket() {
		 
		 return ticketRepositry.findAll();
	 }
	 public boolean deleteAllmovie() {
		 try {
			 ticketRepository.deleteAll();
		 }
		 catch(Exception e)
		 {
			 return false;
		 }
		 return  true;
	 }
	 public Ticket updatTicket(int ticketId,Ticket obj) {
		 
		 Optional<Ticket>addTicket=ticketRepositry.findById(ticket Id);
		 if(addTicket.isPresent())
		 {
			 Ticket oldObj = addContainer.get();
			 oldObj.setName(obj.getName());
			 oldObj.setId (obj.getId());
			 System.out.println("successfully updated ");
			 return ticketRepository saveAndFlush(oldObj);
		 }
		 System.out.println("no object found with these Id ");
		 return obj;
	}


}

}
