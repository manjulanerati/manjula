package com.team.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ShowService {
	@Autowired
	ShowRepositry ShowRepositry;

	 public Show createShow(Show show) {
		 
		 return showRepositry.save(show);
		 
	 }
	 public List<Show>Show() {
		 
		 return showRepositry.findAll();
	 }
	 public boolean deleteAllmovie() {
		 try {
			 showRepository.deleteAll();
		 }
		 catch(Exception e)
		 {
			 return false;
		 }
		 return  true;
	 }
	 public Show updateSeat(int showId,Show obj) {
		 
		 Optional<Show>addShow=showRepositry.findById(show Id);
		 if(addShow.isPresent())
		 {
			 Show oldObj = addContainer.get();
			 oldObj.setName(obj.getName());
			 oldObj.setId (obj.getId());
			 System.out.println("successfully updated ");
			 return showRepository saveAndFlush(oldObj);
		 }
		 System.out.println("no object found with these Id ");
		 return obj;
	}


}

}
