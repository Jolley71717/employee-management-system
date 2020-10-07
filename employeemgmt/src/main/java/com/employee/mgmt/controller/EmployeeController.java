package com.employee.mgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.mgmt.model.Employee;
import com.employee.mgmt.repository.EmployeeRepository;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	//get all employee 
	@GetMapping("/Employee")
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}

}

