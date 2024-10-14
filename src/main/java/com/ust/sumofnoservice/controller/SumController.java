package com.ust.sumofnoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class SumController { 
	@GetMapping("/of/{nums}") 
	public int sum(@PathVariable String nums) { 
		String[] n = nums.split(","); 
		int s = 0; 
		for(String st: n) s += Integer.parseInt(st); 
		return s;
	}
}
