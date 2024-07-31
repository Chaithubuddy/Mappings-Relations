package com.spyd.curd.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spyd.curd.Entity.Project;

@Repository
public interface projectRepo extends JpaRepository<Project, Integer> {

}
