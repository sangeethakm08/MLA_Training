package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/")
	public String simpleHomePage(Model model) {
		//Model and view Model return the view of the web page rather than the text
		model.addAttribute("msg", "Welcome to thymeleaf");
		return "index";
	}
}
