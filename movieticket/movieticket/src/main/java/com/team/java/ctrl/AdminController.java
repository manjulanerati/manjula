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

import com.capg.java.entity.Booking;
import com.team.java.service.BookingService;
@RestController
public class AdminController {
	@Autowired
	AdminService adminService;
	@PostMapping("/admin")
	public Admin addAdmin(@RequestBody Admin admin)
	{
		return adminService.addAdmin(admin);
	}
	@GetMapping("/admin")
	public List<Admin> getAdmin()
	{
		return adminService.getAdmin();
	}
	@DeleteMapping("/admin")
	public boolean deleteAllAdmin()
	{
		return adminService.deleteAllAdmin();
	}
@PutMapping("/admin")
public Admin updateAdmin(@PathVariable int customerId, @RequestBody Admin obj) 
{
	return adminService.updateAdmin(customerId,obj);
	
}



}
