package com.BikkadIT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.model.Employee;
import com.BikkadIT.model.EmployeePkId;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeePkId>{

}
