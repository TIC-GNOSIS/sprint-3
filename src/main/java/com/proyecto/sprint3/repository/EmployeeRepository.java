package com.proyecto.sprint3.repository;

import com.proyecto.sprint3.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
