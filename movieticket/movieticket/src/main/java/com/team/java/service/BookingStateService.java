package com.team.java.service;

public class BookingStateService {
 @Autowired
 BookingStateRepositry BookingStateRepositry;
 
 public BookingState createBooking(BookingState bookingState)
 return  bookingStateRepositry.findAll()
}
public boolean deleteAllBooking() {
	try {
		bookingStateRepositry.deleteAll();
	}
	catch(Exception e)
	{
		return false;
	
	}
	return true;
	
}
  public BookingState update BookingState(int bookingState Id,Booking obj);
  
  Optional<BookingState>addContainer=bookingRepositry.findById(bookingState Id);
  
  if(addContainer .isPresent())
  {
	  Booking oldObj =addContainer.get();
	  oldObj.SetName(obj.Container.get());
      oldObj.SetId(obj.Container.get());
      oldObj.SetPassword(obj.Container.get());
	  System.out.println("successfully updated");
	  return bookingStateRepositry saveAndFlush(oldObj);
  }
  System.out.println("no object found with this id");
  return obj;
  }
  }
