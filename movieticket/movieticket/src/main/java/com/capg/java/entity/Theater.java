package com.capg.java.entity;

import java.util.List;


public class Theater {
	
	private int theaterId;
	private String theaterName;
	private String theaterCity;
	private Movie movies;
	private List<Screen> listOfScreen;
	private String managerName;
	private String managerContact;
	@Override
	public String toString() {
		return "Theater [theaterId=" + theaterId + ", theaterName=" + theaterName + ", theaterCity=" + theaterCity
				+ ", managerName=" + managerName + ", managerContact=" + managerContact + "]";
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	public Theater(String managerContact) {
		super();
		this.managerContact = managerContact;
	}
	public Theater() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
