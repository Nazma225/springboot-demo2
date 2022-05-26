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

	@GetMapping(value="/name/{name}")
	public String fetchName(@PathVariable(name="name") String name) {
		return "Hello "+name;
	}
	
	@GetMapping(value="/address/{address}")
	public String getAddress(@PathVariable(name="address") String address) {
		return "Address is:"+address;
		
	}
	
	@GetMapping(value="/technology/{technology}")
	public String getTechnology(@PathVariable(name="technology") String technology) {
		return "Technology is:"+ technology;
		
	}
	
	@PostMapping(value="/add")
	public String addName(@RequestBody Map<String, String> map) {
		String name = map.get("name");
		String address = map.get("address");
		String tech=map.get("technology");
		String phno=map.get("phno");
		return "Hello "+name + ", Your Address is: "+address+", Technology is:"+tech+" and your phone number is:"+phno  ;
	}
}
