package com.spyd.curd.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spyd.curd.Entity.Employee;
import com.spyd.curd.Service.EmployeeService;

@RestController
@RequestMapping("Employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee saveEmployee = employeeService.saveEmployee(employee);
		return new ResponseEntity<Employee>(saveEmployee, HttpStatus.CREATED);

	}

	@PutMapping("update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		Employee updatedEmployee = employeeService.updateEmployee(employee);
		return ResponseEntity.ok(updatedEmployee);

	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable Integer id) {
		employeeService.deleteEmployee(id);
		return new ResponseEntity<Employee>(HttpStatus.OK);

	}

	@GetMapping("getBY/{id}")
	public ResponseEntity<Optional<Employee>> getStudent(@PathVariable Integer id) {
		Optional<Employee> employee = employeeService.getEmployeeById(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);

	}

	@GetMapping("getAll")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> listEmployess = employeeService.getAllEmployee();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(listEmployess);
	}

}
