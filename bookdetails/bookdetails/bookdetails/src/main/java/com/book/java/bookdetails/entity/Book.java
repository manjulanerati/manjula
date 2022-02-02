package com.book.java.bookdetails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.Size;

@Entity
@Table(name="book_details")
public class Book
{
	@Id
	@Column(name="book_id",nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookId;
	
	private String bookName;
	
	private String authorName;
	
	private String publicationName;
	
	private double price;
	
	
	public Book()
	{
	super();
	}
	
	public Book(int bookId, String bookName, String authorName, String publicationName, double price)
	{
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.authorName = authorName;
	this.publicationName = publicationName;
	this.price = price;
	}
	
	public int getBookId() {
	return bookId;
	}
	
	public void setBookId(int bookId) {
	this.bookId = bookId;
	}
	
	public String getBookName() {
	return bookName;
	}
	
	public void setBookName(String bookName) {
	this.bookName = bookName;
	}
	
	public String getAuthorName() {
	return authorName;
	}
	
	public void setAuthorName(String authorName) {
	this.authorName = authorName;
	}
	
	public String getPublicationName() {
	return publicationName;
	}
	
	public void setPublicationName(String publicationName) {
	this.publicationName = publicationName;
	}
	
	public double getPrice() {
	return price;
	}
	
	public void setPrice(double price) {
	this.price = price;
	}
	
	@Override
	public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", publicationName="
	+ publicationName + ", price=" + price + "]";
	}

}