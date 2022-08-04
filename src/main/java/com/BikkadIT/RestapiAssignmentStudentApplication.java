package com.BikkadIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.Repository.StudentRepository;
import com.BikkadIT.Service.ServiceIMPL;
import com.BikkadIT.model.Student;

@SpringBootApplication
public class RestapiAssignmentStudentApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(RestapiAssignmentStudentApplication.class, args);
	
	
	ServiceIMPL serviceIMPL = context.getBean(ServiceIMPL.class);

	
//	Student student= serviceIMPL.findByStudentAge(0);
//	System.out.println(student);
	
}
	}
