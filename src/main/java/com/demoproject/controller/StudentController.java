package com.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.Entity.Student;
import com.demoproject.service.ServiceImpl;
@RestController
@CrossOrigin
public class StudentController {

	@Autowired
	private ServiceImpl impl;
	
	@PostMapping("/add")
	public String GetStudent(@RequestBody Student student) {
		impl.SaveStudent(student);
		return "Registration Completed";
	}
	
	@GetMapping("/getall")
	public List<Student> getall(){
		return impl.getAllStudent();
	}
}
