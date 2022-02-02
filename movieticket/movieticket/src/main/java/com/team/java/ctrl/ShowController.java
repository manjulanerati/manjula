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

import com.capg.java.entity.Seat;
import com.capg.java.entity.Show;
import com.team.java.service.CustomerService;
import com.team.java.service.ShowService;
@RestController
public class ShowController {
	@Autowired
	 ShowService  showService;
	@PostMapping("/shows")
	public Show addShow(@RequestBody Show show)
	{
		return showService.addMovie(show);
	}
@GetMapping("/shows")
public List<Show> getShow(){
	return showService.getShow();
}
@DeleteMapping("/shows")
public boolean deleteAllShows()
{
	return showService.deleteAllShows();
	
}
@PutMapping("/shows")
public Seat updateShow(@PathVariable int showId, @RequestBody Show obj) {
	return showService.updateShow(showId,obj);
	
}
}
