package com.sujit.transactional_annotation.repository;

import com.sujit.transactional_annotation.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee,Integer> {
}
