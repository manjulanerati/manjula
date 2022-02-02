package com.team.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MovieService {
@Autowired
MovieRepositry MovieRepositry;

 public Movie createMovie(Movie movie) {
	 
	 return movieRepositry.save(movie);
	 
 }
 public List<Movie>Movie() {
	 
	 return movieRepositry.findAll();
 }
 public boolean deleteAllmovie() {
	 try {
		 movieRepository.deleteAll();
	 }
	 catch(Exception e)
	 {
		 return false;
	 }
	 return  true;
 }
 public Movie updateCustomer(int movieId,Movie obj) {
	 
	 Optional<Movie>addMovie=movieRepositry.findById(movie Id);
	 if(addMovie.isPresent())
	 {
		 Movie oldObj = addContainer.get();
		 oldObj.setName(obj.getName());
		 oldObj.setId (obj.getId());
		 System.out.println("successfully updated ");
		 return movieRepository saveAndFlush(oldObj);
	 }
	 System.out.println("no object found with these Id ");
	 return obj;
}
