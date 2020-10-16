package com.example.demo.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demos")
public class DemoController 
{

	@GetMapping("/hello")
	public String helloWorld()
	{
		return "Hello Spring World!!!";
	}
	
	@GetMapping("hello-name")
	public String helloWorld(@RequestParam(defaultValue="World") String name)
	{
		return "Hello "+name;
	}
	
}
