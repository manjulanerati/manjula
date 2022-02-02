package com.team.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

	@Autowired
	BookingRepositry bookingRepositry;
	
	public Booking createBooking(Booking booking) {
		
		return bookingRepositry.save(booking);
		
	}
	public List<Booking>getBooking() {
		
		return bookingRepositry.findAll();
	}
	
	public boolean deleteAllBooking() {
		try {
			bookingRepositry.deleteAll();
		}
		catch (Exception e)
		{
			return false;
		}
		
		  return true;
	}
	public Booking updateBooking(int bookingId,Booking obj) {
		
		Optional<Booking>addContainer=addRepositry.findById(bookingId);
		if(addContainer.isPresent())
		{
			Booking oldobj=addContainer.get();
			oldObj.setName =addContainer.get();
			oldObj.setId =addContainer.get();
			oldObj.setPassword=addContainer.get();
			System.out.println("successfully updated");
			return bookingRepositry saveAndFlush(old Obj);
		}
		System.out.println("no object found with these id");
		return obj;
	}
		
