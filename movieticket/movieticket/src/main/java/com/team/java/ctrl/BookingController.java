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

import com.capg.java.entity.Booking;
import com.team.java.service.BookingService;

@RestController
public class BookingController {
	@Autowired
	BookingService bookingService;
	@PostMapping("/booking")
	public Booking addBooking(@RequestBody Booking booking)
	{
		return bookingService.addBooking(booking);
	}
	@GetMapping("/booking")
	public List<Booking> getBooking()
	{
		return bookingService.getBooking();
	}
	@DeleteMapping("/booking")
	public boolean deleteAllBookings()
	{
		return bookingService.deleteAllBookings();
	}
@PutMapping("/booking")
public Booking updateBooking (@PathVariable int customerId, @RequestBody Booking obj) 
{
	return bookingService.updateBooking (customerId,obj);
	
}


