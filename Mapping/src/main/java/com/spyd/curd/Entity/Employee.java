package com.spyd.curd.Entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Double sal;
	private String depatment;

	@OneToOne(cascade = CascadeType.ALL, targetEntity = Passport.class)
	@JoinColumn(name = "passport_id")
	private Passport passport;
	
	
	@OneToMany(cascade = CascadeType.ALL, 
			  targetEntity = Project.class,
		             fetch = FetchType.LAZY,
	         orphanRemoval = true)
		@JoinColumn(name="employe_id",referencedColumnName = "id")
		private List<Project> project;
	
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Courses.class)
	@JoinTable(name = "EmployeeCoursetable", 
	             joinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "id"), 
	      inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "courseid"))
	private Set<Courses> courses;
	
	
	
	
	
	

}
