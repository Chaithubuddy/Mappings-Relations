package com.spyd.curd.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spyd.curd.Dao.EmployeeDao;
import com.spyd.curd.Dao.PassportRepo;
import com.spyd.curd.Entity.Employee;
import com.spyd.curd.Entity.Passport;
import com.spyd.curd.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeRepo;

	@Autowired
	private PassportRepo passportRepo;

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeRepo.save(employee);

	}

	@Override
	public void deleteEmployee(Integer id) {
		employeRepo.deleteById(id);
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer id) {
		return employeRepo.findById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeRepo.findAll();
	}

}
