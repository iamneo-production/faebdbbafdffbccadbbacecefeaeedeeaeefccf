package com.example.springapp.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestContoller;

@RestController

public class ApiController {
    @GetMapping("/welcome")
	public String welcome(){
		return "Welcome String Boot";
	}
}
