package com.BikkadIT.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Repository.EmployeeRepository;
import com.BikkadIT.model.Employee;

@Service
public class ServiceIMPL  implements ServiceI{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void SaveEmployee(Employee employee) {
		
		employeeRepository.save(employee);
	}
	
}
