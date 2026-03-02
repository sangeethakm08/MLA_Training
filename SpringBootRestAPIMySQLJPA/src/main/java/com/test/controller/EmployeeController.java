package com.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Employee;
import com.test.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/employee/v1/api")
@Tag(name = "EMPLOYE CRUD OPERATIONS")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/create")
	@Operation(summary = "CREATE EMPLOYEE")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp)
	{
		Employee eobj = service.saveEmployee(emp);
		
		if(eobj != null)
		{
			return new ResponseEntity<>(eobj, HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<>(eobj, HttpStatus.NO_CONTENT); 
		}
	}
	
	@GetMapping("/list")
	@Operation(summary = "Listing all employees")
	public ResponseEntity<List<Employee>> listAllEmployees()
	{
		List<Employee> list = service.getAllEmployees();
		
		if(list.size() > 0)
		{
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(list, HttpStatus.NO_CONTENT);
		}

		@GetMapping("/{id}")
		@Operation(summary = "Get employee by id")
		public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id)
		{
			Optional<Employee> opt = service.getEmployeeById(id);

			if(opt.isPresent())
			{
				return new ResponseEntity<>(opt.get(), HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}

		@PutMapping("/update")
		@Operation(summary = "Update an existing employee")
		public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp)
		{
			Employee updated = service.updateEmployee(emp);

			if(updated != null)
			{
				return new ResponseEntity<>(updated, HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}

		@DeleteMapping("/delete/{id}")
		@Operation(summary = "Delete employee by id and return remaining employees")
		public ResponseEntity<List<Employee>> deleteEmployee(@PathVariable("id") int id)
		{
			List<Employee> list = service.deleteEmployeeById(id);

			if(list != null && list.size() > 0)
			{
				return new ResponseEntity<>(list, HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<>(list, HttpStatus.NO_CONTENT);
			}
		}
	}
}
