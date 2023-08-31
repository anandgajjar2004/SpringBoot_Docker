package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

	@GetMapping("test_api/")
	public List<String> generateToken() {

		List<String> studentNames = new ArrayList<>();
		// Here you can fetch student names from a database or any other source
		// For now, let's assume some sample names
		studentNames.add("Alice");
		studentNames.add("Bob");
		studentNames.add("Charlie");
		return studentNames;
	}

}