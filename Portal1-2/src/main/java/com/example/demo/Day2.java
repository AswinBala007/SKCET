package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day2 {
@Value("${name.st}")
private String str;

@GetMapping("/im")
public String intro()
{
	return "I am from"+str;
}
}
