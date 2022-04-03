package com.employee.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Employee;

/**
 * Handles requests for the Employee service.
 */
@RestController

@RequestMapping("employee")

public class EmployeeController {

	// Map to store employees, ideally we should use database
	Map<Integer, Employee> empData = new HashMap<Integer, Employee>();
	public static final String EMP = "/employees";

	@RequestMapping(value = EMP, method = RequestMethod.GET)
	public @ResponseBody Map<Integer, Employee> getDummyEmployee() {

		Employee emp = new Employee();
		emp.setEmpId("1");
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setSalary("3000");
		empData.put(1, emp);
		emp.setEmpId("2");
		emp.setName("emp2");
		emp.setDesignation("developer");
		emp.setSalary("3000");
		empData.put(2, emp);
		return empData;
	}
}
