package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Names {

	public String cl="Imneo";
	@GetMapping("/int")
	public String Color()
	{
		return "Welcome "+cl+"!";
	}
}
