package com.test.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableMethodSecurity
public class UserController {

   
	@GetMapping("/")
	public String homePage() {
		return "index";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/read")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_USER')")
	public String userPage() {
		return "USER AND ADMIN CAN READ THE DATA";
	}
	
	@GetMapping("/delete")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	public String adminPage() {
		return "ONLY ADMIN CAN DELETE THE DATA";
	}
	

	@GetMapping("/task")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_EMPLOYEE', 'ROLE_HR', 'ROLE_ADMIN')")
	public String updateHR() {
		return "ONLY ASSIGN task";
	}
	
	@GetMapping("/work")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_EMPLOYEE')")
	public String empPage() {
		return "ONLY work on ASSIGNed task";
	}
	
	@GetMapping("/update")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_HR')")
	public String updateUsers() {
		return "Details updated with ADMIN and HR role";
	}
	
	
	
}
