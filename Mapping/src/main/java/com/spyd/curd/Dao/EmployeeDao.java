package com.spyd.curd.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spyd.curd.Entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
