package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class EmpController {
	@GetMapping
	public String getEmp() {
		return "Srinivas";
	}
	
	@PostMapping
	public Emp createEmp(@RequestBody Emp emp) {
		return emp;
	}
}
