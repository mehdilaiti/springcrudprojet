package com.example.springdata.repository;

import com.example.springdata.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
    // JpaRepository already provides findById method by default
}