package com.team.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	@Autowired
	UserRepositry UserRepositry;

	 public User createUser(User user) {
		 
		 return userRepositry.save(user);
		 
	 }
	 public List<User>user() {
		 
		 return userRepositry.findAll();
	 }
	 public boolean deleteAlluser() {
		 try {
			 userRepository.deleteAll();
		 }
		 catch(Exception e)
		 {
			 return false;
		 }
		 return  true;
	 }
	 public User updateSeat(int userId,Userobj) {
		 
		 Optional<User>addUser=userRepositry.findBy(user Id);
		 if(addUser.isPresent())
		 {
			 User oldObj = addContainer.get();
			 oldObj.setName(obj.getName());
			 oldObj.setId (obj.getId());
			 System.out.println("successfully updated ");
			 return UserRepository saveAndFlush(oldObj);
		 }
		 System.out.println("no object found with these Id ");
		 return obj;
	}


}

}
