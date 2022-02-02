package com.book.java.bookdetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.java.bookdetails.entity.Book;
import com.book.java.bookdetails.repo.BookRepository;

@Service
public class BookService 
{
	@Autowired
	BookRepository bookRepository;
	
	public Book postBooks(Book books)
	{
		return bookRepository.save(books);
	}
	public List<Book> getBooks()
	{
		return bookRepository.findAll();
	}
	public Book updateBookById(int id, Book obj)
	{
		Optional<Book> bookContainer = bookRepository.findById(id);
		
		if(bookContainer.isPresent())
		{
			Book newObj = bookContainer.get();
			newObj.setBookName(obj.getAuthorName());
			newObj.setAuthorName(obj.getAuthorName());
			newObj.setPrice(obj.getPrice());
			newObj.setPublicationName(obj.getPublicationName());
			System.out.println("updated succesfully");
			return bookRepository.saveAndFlush(newObj);
		}
		else
		{
			System.out.println("No object found with this id!!!");
			return obj;
		}
	}
	
	public Book getBookById(int id)
	{
		Optional<Book> bookContainer = bookRepository.findById(id);
		
		if(bookContainer.isPresent())
		{
			return bookContainer.get();
		}
		else
		{
			return null;
		}
	}
	
	public Book viewBookByName(String bookName)
	{
		return bookRepository.getBybookName(bookName);
	}
	
	public String deleteBookById(int id)
	{
		Optional<Book> bookContainer = bookRepository.findById(id);
		
		if(bookContainer.isPresent())
		{
			Book oldObj = bookContainer.get();
			bookRepository.delete(oldObj);
			return "Deleted Successfully!!!";
		}
		else
		{
			return "The specified id is not present in database.";
		}
	}
}
