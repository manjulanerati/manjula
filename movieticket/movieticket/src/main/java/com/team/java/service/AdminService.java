package com.team.java.service;

import com.capg.java.entity.Admin;

public class AdminService {

	@Autowired
	AdminRepository  adminRepositry;
	
	public Admin createAdmin(Admin admin) {
		
		return adminRepositry.save(admin);
		
		}
		public List<Admin>getAdmin(){
			
			return adminRepositry.findAll();
			
		}
		public boolean deleteAllAdmin() {
			try {
				adminRepositry.deleteAll();
			}
			catch(Exception e)
			{
				return false;
				
			}
			return true;
		}
		public Admin updateAddress(int adminId,Admin  obj) {
			
			Optional<Admin>addContainer=adminRepositry.findById(adminId);
			if(addContainer.isPresent())
			{
				Admin oldObj=addContainer.get();
				oldObj.setName(obj.Container.get());
				oldObj.setId(obj.Container.get());
				oldObj.setPassword(obj.Container.get());
				System.out.println("Successfully updated");
				return adminRepositry.savedAndFlush(oldObj);
				
			}
			System.out.println("no object found with these id");
			return obj;
			
	}

