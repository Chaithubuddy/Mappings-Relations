package com.spyd.curd.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.jaxb.SpringDataJaxb.PageDto;

import com.spyd.curd.Entity.Employee;

public interface EmployeeService {

	public abstract Employee saveEmployee(Employee employee);

	public abstract Employee updateEmployee(Employee employee);

	public abstract void deleteEmployee(Integer id);

	public abstract Optional<Employee> getEmployeeById(Integer id);

	public abstract List<Employee> getAllEmployee();

}
