package com.team.java.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capg.java.entity.Seat;
import com.capg.java.entity.Show;
import com.team.java.service.ShowService;

public class TheatreController {
	@Autowired
	 ShowService  theatreService;
	@PostMapping("/theatres")
	public Theatre addTheatre(@RequestBody Theatre theatre)
	{
		return theatreService.addTheatre(theatre);
	}
@GetMapping("/theatres")
public List<Theatre> getTheatre(){
	return showTheatre.getTheatre();
}
@DeleteMapping("/theatres")
public boolean deleteAllTheatres()
{
	return theatreService.deleteAllTheatres();
	
}
@PutMapping("/theatres")
public Theatre updateTheatre(@PathVariable int theatreId, @RequestBody Theatre obj) {
	return theatreService.updateTheatre(theatreId,obj);
	
}
}
