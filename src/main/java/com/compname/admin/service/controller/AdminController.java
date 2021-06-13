package com.compname.admin.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compname.admin.service.dto.AdminDTO;
import com.compname.admin.service.entity.AdminEntity;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/admincontroller")

public class AdminController {

	@GetMapping("/ping")
	public String Greeting()
	{
		return "pong";
	}

	@Autowired
	AdminDTO adminRepository;
	
	@GetMapping("/showadmins")
	public List<AdminEntity> getadmin() 
	{
		return (List<AdminEntity>) adminRepository.findAll();
	}
		
	@PostMapping("/saveadmins")
	public String insertadmin(@RequestBody AdminEntity admins) {
		adminRepository.save(admins);
		return "One builder saved successfully!";

	}
	@PostMapping("/saveadmins")
	public String insertadmin(@RequestBody List<AdminEntity> admins) {
		adminRepository.saveAll(admins);
		return "Builder's saved successfully!";

	}
	
	@PutMapping("/updateadmins")
	public AdminEntity updateadmin(@RequestBody AdminEntity admins) {
		return adminRepository.save(admins); 
	}
	
	@PutMapping("/updatadmins")
	public List<AdminEntity> updateadmin1(@RequestBody List<AdminEntity> admins) {
		return adminRepository.saveAll(admins); 
	}
	
	@DeleteMapping("/deleteadmins")
	public String delete (@RequestBody AdminEntity admins) {
		adminRepository.deleteById(admin.getadminId());
		return "Record deleted successfully !" ;
	}


}
	
	
	

