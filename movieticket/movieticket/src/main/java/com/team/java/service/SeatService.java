 package com.team.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SeatService {
	@Autowired
	SeatRepositry SeatRepositry;

	 public Seat createSeat(Seat seat) {
		 
		 return seatRepositry.save(seat);
		 
	 }
	 public List<Seat>Seat() {
		 
		 return seatRepositry.findAll();
	 }
	 public boolean deleteAllmovie() {
		 try {
			 seatRepository.deleteAll();
		 }
		 catch(Exception e)
		 {
			 return false;
		 }
		 return  true;
	 }
	 public Seat updateSeat(int seatId,Seat obj) {
		 
		 Optional<Seat>addSeat=seatRepositry.findById(seat Id);
		 if(addSeat.isPresent())
		 {
			 Seat oldObj = addContainer.get();
			 oldObj.setName(obj.getName());
			 oldObj.setId (obj.getId());
			 System.out.println("successfully updated ");
			 return seatRepository saveAndFlush(oldObj);
		 }
		 System.out.println("no object found with these Id ");
		 return obj;
	}


}
