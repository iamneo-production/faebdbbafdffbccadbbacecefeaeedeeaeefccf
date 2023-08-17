package com.example.springapp.Controllers;
import
@RestController

public class ApiController {
    @GetMapping("/welcome")
	public String welcome(){
		return "Welcome String Boot";
	}
}
