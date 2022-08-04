package com.BikkadIT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.Service.ServiceI;
import com.BikkadIT.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	private ServiceI serviceI;
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		serviceI.SaveEmployee(employee);
		
		return "data Saved";
		
	}

}
