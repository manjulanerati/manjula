package com.book.java.bookdetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.java.bookdetails.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer>
{
	Book getBybookName(String bookName);
}
