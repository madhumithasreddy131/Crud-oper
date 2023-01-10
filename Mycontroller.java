package com.example.week8a;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	@Autowired
	private StudentService studentservice;
	@GetMapping("/")
	public String show1() {
		return("<h1>Welcome to CRUD Operations</h1>");
	}
	@GetMapping("/user")
	public String show2() {
		return("<h1>Hello this is USER</h1>");
	}
	@GetMapping("/admin")
	public String show3() {
		return("<h1>Hello this is  ADMIN</h1>");
	}
	
	@GetMapping("student1")
	 private List<Student> show() {
	 return this.studentservice.Display();
	 }
	 @PostMapping("student1")
	 private Student show2( @RequestBody Student st)
	 {
	 return this.studentservice.addStudent(st);
	 }
	 @PutMapping("student1")
	 private Student show3(@RequestBody Student st) {
	 return this.studentservice.updateStudent(st);
	 }
	 @DeleteMapping("student1/{studentregno}")
	 private void show4(@RequestBody int studentregno){
	 this.studentservice.deleteStudent(studentregno);
	 }
	 
	} 


