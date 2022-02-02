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

import com.capg.java.entity.Customer;
import com.capg.java.entity.Movie;
import com.team.java.service.CustomerService;
import com.team.java.service.MovieService;
@RestController
public class MovieController {
	@Autowired
	 CustomerService  movieService;
	@PostMapping("/movies")
	public Movie addMovie(@RequestBody Movie movie))
	{
		return movieService.addMovie(movie);
	}
@GetMapping("/movies")
public List<Movie> getMovie(){
	return movieService.getMovie();
}
@DeleteMapping("/movies")
public boolean deleteAllMovies()
{
	return movieService.deleteAllMovies();
	
}
@PutMapping("/movies")
public Movie updateMovie(@PathVariable int movieId, @RequestBody Movie obj) {
	return movieService.updateMovie(movieId,obj);
	
}
}
