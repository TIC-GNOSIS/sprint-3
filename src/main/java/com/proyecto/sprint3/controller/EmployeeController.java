package com.proyecto.sprint3.controller;

import com.proyecto.sprint3.Enum.Enum_RolName;
import com.proyecto.sprint3.entity.Employee;
import com.proyecto.sprint3.entity.Enterprise;
import com.proyecto.sprint3.entity.Profile;
import com.proyecto.sprint3.entity.Transaction;
import com.proyecto.sprint3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService servicio;
    @GetMapping("/employee")
    public String generarEmployee(){
        Employee miEmployee = new Employee(789L, "mmontealegrer@gmail.com", new Profile(), Enum_RolName.Admin, new Enterprise(), new ArrayList<Transaction>(), new Date(), new Date());
        return miEmployee.toString();
    }

    @PostMapping("/employee")
    public void guardarEmployee(@RequestBody Employee employee){
        servicio.guardarEmpleado(employee);
    }

    @PutMapping("/employee")
    public  ResponseEntity<?> actualizarEmployee(@RequestBody Employee employee, @PathVariable Long id){
        Employee employeeExistente = servicio.buscarEmpleadoPorId(id);
        servicio.guardarEmpleado(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @DeleteMapping("/employee")
    public void eliminarEmployee(@PathVariable Long id){
        servicio.eliminarEmpleado(id);
    }

}
