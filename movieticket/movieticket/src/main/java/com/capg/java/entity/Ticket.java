package com.capg.java.entity;

public class Ticket {
	private int ticketId;
	private int numberOfSeats;
	private String seatName;
	private Booking bookingRef;
	private boolean ticketStatus;
	private String screenName;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int ticketId, int numberOfSeats, String seatName, Booking bookingRef, boolean ticketStatus,
			String screenName) {
		super();
		this.ticketId = ticketId;
		this.numberOfSeats = numberOfSeats;
		this.seatName = seatName;
		this.bookingRef = bookingRef;
		this.ticketStatus = ticketStatus;
		this.screenName = screenName;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public String getSeatName() {
		return seatName;
	}
	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
	public Booking getBookingRef() {
		return bookingRef;
	}
	public void setBookingRef(Booking bookingRef) {
		this.bookingRef = bookingRef;
	}
	public boolean isTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", numberOfSeats=" + numberOfSeats + ", seatName=" + seatName
				+ ", bookingRef=" + bookingRef + ", ticketStatus=" + ticketStatus + ", screenName=" + screenName + "]";
	}
	

}
