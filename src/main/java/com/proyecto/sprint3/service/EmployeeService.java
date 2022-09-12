package com.proyecto.sprint3.service;

import com.proyecto.sprint3.entity.Employee;
import com.proyecto.sprint3.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
   @Autowired
    private EmployeeRepository repositorio;

    public List<Employee> listarEmpleado(){
        return repositorio.findAll();

    }

    public void guardarEmpleado(Employee empleado){
        repositorio.save(empleado);
    }

    public Employee buscarEmpleadoPorId(long id){
        return repositorio.findById(id).get();

    }

    public void eliminarEmpleado(long id){
        repositorio.deleteById(id);
    }
}
