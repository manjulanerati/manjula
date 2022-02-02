package com.team.java.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capg.java.entity.Booking;
import com.team.java.service.BookingService;
@RestController
public class BookingStateController {
	@Autowired
	BookingService bookingService;
	@PostMapping("/booking")
	public BookingState addBookingState(@RequestBody Booking booking)
	{
		return bookingstateService.addBookingState(booking);
	}
	@GetMapping("/bookingstate")
	public List<BookingState> getBookingState()
	{
		return bookingstateService.getBookingState();
	}
	@DeleteMapping("/bookingstate")
	public boolean deleteAllBookingStates()
	{
		return bookingstateService.deleteAllBookingStates();
	}
@PutMapping("/bookingstate")
public BookingState updateBookingState (@PathVariable int customerId, @RequestBody Booking obj) 
{
	return bookingstaetService.updateBookingState (customerId,obj);
	
}



}
