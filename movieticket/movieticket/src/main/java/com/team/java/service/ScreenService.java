package com.team.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ScreenService {
@Autowired
ScreenRepositry screenRepositry;

 public Screen createScreen(Screen screen) {
	 
	 return screenRepositry.save(screen);
	 
 }
 public List<Screen>getScreen() {
	 
	 return ScreenRepositry.findAll();
 }
 public boolean deleteAllScreen() {
	 try {
		 screenRepository.deleteAll();
	 }
	 catch(Exception e)
	 {
		 return false;
	 }
	 return  true;
 }
 public Screeen updateScreen(int screenId,Screen obj) {
	 
	 Optional<Screen>addScreen=screenRepositry.findById(screenId);
	 if(addScreen.isPresent())
	 {
		 Screen oldObj = addContainer.get();
		 oldObj.setName(obj.getName());
		 oldObj.setId (obj.getId());
		 System.out.println("successfully updated ");
		 return movieRepository saveAndFlush(oldObj);
	 }
	 System.out.println("no object found with these Id ");
	 return obj;
}
}
