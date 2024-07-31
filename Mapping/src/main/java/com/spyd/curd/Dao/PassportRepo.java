package com.spyd.curd.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spyd.curd.Entity.Passport;
@Repository
public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
