package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product1")

public class PRoduct1Controller {

	@GetMapping("/service1")
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String product1Sevice() {
		return "this is simple Spring cloud Reactive API service -1";
	}
}
