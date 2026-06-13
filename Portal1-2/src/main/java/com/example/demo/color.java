package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class color {
	public String clr="Black";
	@GetMapping("/clr")
	public String Color()
	{
		return "My Fav Color is "+clr;
	}
}
