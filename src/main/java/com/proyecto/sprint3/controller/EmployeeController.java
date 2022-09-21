package com.proyecto.sprint3.controller;


import com.proyecto.sprint3.entity.Employee;
import com.proyecto.sprint3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService servicio;

    @GetMapping("/employee")
    public List<Employee> generarEmployee(){
        return servicio.listarEmpleado();
    }


    @PostMapping("/employee")
    public void guardarEmployee(@RequestBody Employee employee){
        servicio.guardarEmpleado(employee);
    }

    @PatchMapping("/employee/{id}")
    public  ResponseEntity<?> actualizarEmployee(@RequestBody Employee employee, @PathVariable Long id){
        Employee employeeExistente = servicio.buscarEmpleadoPorId(id);
        servicio.guardarEmpleado(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @DeleteMapping("/employee/{id}")
    public void eliminarEmployee(@PathVariable("id") Long id){
        servicio.eliminarEmpleado(id);
    }

}
