package com.spyd.curd.Entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseid;
	private String coursename;
	private Double courseprice; 
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "courses",fetch = FetchType.LAZY)
	@JsonBackReference   //child class
	private Set<Employee> student;

}


