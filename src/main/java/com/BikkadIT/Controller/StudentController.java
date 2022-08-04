package com.BikkadIT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.Service.ServiceI;
import com.BikkadIT.model.Student;

@RestController
public class StudentController {
	@Autowired
	private ServiceI serviceI;
	
	@PostMapping(value="/saveStudent" ,consumes = { "application/json","application/xml" },produces = { "application/json","application/xml"})
	public int saveStudent(@RequestBody Student student) {
		
		int saveStudent = serviceI.SaveStudent(student);
		
		
		return saveStudent;
		
	}

	
	@GetMapping(value="/GetAllStudent" ,consumes = { "application/json","application/xml" },produces = { "application/json","application/xml"})
	public List<Student> getAllStudent(@RequestBody Student student) {
		
		List<Student>list=serviceI.getAllStudent();
		
		return list;
		
	}
	@GetMapping(value="/getByStudentAge/{studentAge}" ,consumes = { "application/json","application/xml" },produces = { "application/json","application/xml"})
	public Student getByStudentAge(@PathVariable String studentAge) {
		Student student = serviceI.getByStudentAge(studentAge);
		
		return student;
			
			
}
}