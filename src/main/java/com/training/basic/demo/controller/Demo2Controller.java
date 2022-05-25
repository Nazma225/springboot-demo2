package com.training.basic.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/v2")
public class Demo2Controller {

	@GetMapping(value="/{name}")
	public String fetchName(@PathVariable(name="name") String name) {
		return "Hello "+name;
	}
	
	@PostMapping(value="/add")
	public String addName(@RequestBody Map<String, String> map) {
		String name = map.get("name");
		String address = map.get("address");
		return "Hello "+name + ", Your Address is: "+address  ;
	}
}
