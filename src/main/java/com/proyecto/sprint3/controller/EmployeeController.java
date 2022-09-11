package com.proyecto.sprint3.controller;
import com.proyecto.sprint3.Enum.Enum_RolName;
import com.proyecto.sprint3.entity.Employee;
import com.proyecto.sprint3.entity.Enterprise;
import com.proyecto.sprint3.entity.Profile;
import com.proyecto.sprint3.entity.Transaction;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;

public class EmployeeController {
    @GetMapping("/employee")
    public String generarEmployee(){
        Employee miEmployee = new Employee(789L, "mmontealegrer@gmail.com", new Profile(), Enum_RolName.Admin, new Enterprise(), new ArrayList<Transaction>(), new Date(), new Date());
        return miEmployee.toString();
    }
}
