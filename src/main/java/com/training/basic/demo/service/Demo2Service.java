package com.training.basic.demo.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class Demo2Service {

	
	public String fetchName(String name) {
		return "Hello "+name;
	}
	
	public String getAddress(String address) {
		return "Address is:"+address;
	}
	
	public String getTechnology(String technology) {
		return "Technology is: "+technology;
	}
	
	public String postValues(Map<String, String> map )
	{
		String name=map.get("name");
		String address= map.get("address");
		String technology=map.get("technology");
		String phno=map.get("phno");
		
		return "Name: "+name+", Address: "+address+" technology: "+technology+" Phone number: "+phno;
	}
	
}
