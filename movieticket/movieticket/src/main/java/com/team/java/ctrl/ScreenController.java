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

import com.capg.java.entity.Movie;
import com.capg.java.entity.Screen;
import com.team.java.service.CustomerService;
@RestController
public class ScreenController {
	@Autowired
	 CustomerService  screenService;
	@PostMapping("/screens")
	public Screen addScreen(@RequestBody Screen screen)
	{
		return screenService.addScreen(screen);
	}
@GetMapping("/screens")
public List<Screen> getScreen(){
	return screenService.getScreen();
}
@DeleteMapping("/screens")
public boolean deleteAllScreens()
{
	return movieService.deleteAllScreens();
	
}
@PutMapping("/screens")
public Movie updateScreen(@PathVariable int screenId, @RequestBody Screen obj) {
	return screenService.updateScreen(screenId,obj);
	
}
}
