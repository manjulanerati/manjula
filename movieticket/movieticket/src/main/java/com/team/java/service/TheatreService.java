package com.team.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TheatreService {
	@Autowired
	TheatreRepositry TheatreRepositry;

	 public Theatre createTheatre(Theatre theatre) {
		 
		 return theatreRepositry.save(theatre);
		 
	 }
	 public List<Theatre>Theatre() {
		 
		 return theatreRepositry.findAll();
	 }
	 public boolean deleteAllmovie() {
		 try {
			 theatreRepository.deleteAll();
		 }
		 catch(Exception e)
		 {
			 return false;
		 }
		 return  true;
	 }
	 public Theatre updateTheatre(int theatreId,Theatre obj) {
		 
		 Optional<Theatre>addTheatre=theatreRepositry.findById(theatre Id);
		 if(addSeat.isPresent())
		 {
			 Theatre oldObj = addContainer.get();
			 oldObj.setName(obj.getName());
			 oldObj.setId (obj.getId());
			 System.out.println("successfully updated ");
			 return seatRepository saveAndFlush(oldObj);
		 }
		 System.out.println("no object found with these Id ");
		 return obj;
	}


}

}
