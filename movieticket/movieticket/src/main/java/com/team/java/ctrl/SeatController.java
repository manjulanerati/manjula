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

import com.capg.java.entity.Movie;
import com.capg.java.entity.Screen;
import com.capg.java.entity.Seat;
import com.team.java.service.CustomerService;
@RestController
public class SeatController {
	@Autowired
	 CustomerService  seatService;
	@PostMapping("/seats")
	public Seat addSeat(@RequestBody Seat seat)
	{
		return seatService.addMovie(seat);
	}
@GetMapping("/seats")
public List<Seat> getSeat(){
	return seatService.getSeat();
}
@DeleteMapping("/seats")
public boolean deleteAllSeats()
{
	return seatService.deleteAllSeats();
	
}
@PutMapping("/seats")
public Seat updateSeat(@PathVariable int seatId, @RequestBody Seat obj) {
	return seatService.updateSeat(seatId,obj);
	
}
}
