package com.klef.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/")
	public String home() {
		return "home page";
	}
	@GetMapping("/next")
	public String nextpage() {
		return "nextpage";
	}

}
