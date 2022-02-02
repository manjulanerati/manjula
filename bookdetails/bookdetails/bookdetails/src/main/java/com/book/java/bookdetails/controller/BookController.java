package com.book.java.bookdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.java.bookdetails.entity.Book;
import com.book.java.bookdetails.service.BookService;

@RestController
public class BookController
{
	@Autowired
	BookService bookService;
	@PostMapping("/books")
	//We have to define ResponseEntity<Book> instead only Book
	public ResponseEntity<Book> postBooks(@RequestBody Book books)
	{
		/*
		* If the book name length is 0,We will through a Http Status Bad request.
		* Please read the problem statement of your project carefully.
		* There it defines different business rules.
		*/
		if(books.getBookName().trim().length()==0)
		{
			return new ResponseEntity<Book>(books,HttpStatus.BAD_REQUEST);
		}
		/*
		* if the author name length is less than 2, We will through a bad request
		*/
		if(books.getAuthorName().trim().length()<2) 
		{
			return new ResponseEntity<Book>(books,HttpStatus.BAD_REQUEST);
		}
		/* Here it returns HttpStatus.OK, if the Problem Statement the return status is Created, then you have to return that
		* HttpStatus.CREATED   //201
		* HttpStatus.OK     //200
		* In problem statment it will be there whether it will return 200 or 201.
		* */
		return new ResponseEntity<Book>(bookService.postBooks(books),HttpStatus.CREATED);
	}
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks()
	{
		List<Book> bookList = bookService.getBooks();
		/*If there is data in the bookDetails table then the list size is greater than 0
		* if List size greater than 0, then we will return OK/200 status(HttpStatus.OK)
		* if list size is 0, then we have to return 204 (HttpStatus.NO_CONTENT)
		* */
		if(bookList.size()>0) 
		{
			return new ResponseEntity<List<Book>>(bookList,HttpStatus.OK);
		}
		else 
		{
			return new ResponseEntity<List<Book>>(bookList,HttpStatus.NO_CONTENT);
		}
	}
	@PutMapping("/books/{id}")
	public ResponseEntity<Book> updateBookById(@PathVariable int id,@RequestBody Book obj)
	{
		/* Please check the problem statement in the program. If in problem statement
		* the rule is like book id should greater than 100 and less than 5000, and in problem statement it will be there,
		* Which status you have to return? 200,204,400,500  (OK,NO_CONTENT,BAD_REQUEST,INTERNAL_SERVER_ERROR)
		* */
		if(obj.getBookId()<100 && obj.getBookId()>5000)
		{
			return new ResponseEntity<Book>(obj,HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Book>( bookService.updateBookById(id,obj),HttpStatus.OK);
	}
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable int id)
	{
		return new ResponseEntity<Book>(bookService.getBookById(id),HttpStatus.OK);
	}
	@DeleteMapping("/books/{id}")
	public ResponseEntity<String> deleteBookById(@PathVariable int id)
	{
		return new ResponseEntity<String>(bookService.deleteBookById(id),HttpStatus.OK);
	}
}
