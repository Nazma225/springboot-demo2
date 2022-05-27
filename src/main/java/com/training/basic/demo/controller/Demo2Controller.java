package com.training.basic.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.basic.demo.service.Demo2Service;

@RestController
@RequestMapping("/demo/v2")
public class Demo2Controller {

	
	@Autowired
	private Demo2Service service;
	
	
	@GetMapping(value="/name/{name}")
	public String fetchName(@PathVariable(name="name") String name) {
		return service.fetchName(name);
	}
	
	@GetMapping(value="/address/{address}")
	public String getAddress(@PathVariable(name="address") String address) {
		return service.getAddress(address);
		
	}
	
	@GetMapping(value="/technology/{technology}")
	public String getTechnology(@PathVariable(name="technology") String technology) {
		return service.getTechnology(technology);
		
	}
	
	@PostMapping(value="/add")
	public String addName(@RequestBody Map<String, String> map) {
		 return service.postValues(map);
	}
}
