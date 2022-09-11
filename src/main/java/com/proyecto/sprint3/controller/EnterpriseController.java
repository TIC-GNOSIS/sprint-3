package com.proyecto.sprint3.controller;

import com.proyecto.sprint3.entity.Employee;
import com.proyecto.sprint3.entity.Enterprise;
import com.proyecto.sprint3.entity.Transaction;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;

public class EnterpriseController {

    @GetMapping("/enterprise")
    public String generarEnterprise(){
        Enterprise miEmpresa = new Enterprise(123L, "Kikeana", "01500123", "3001234567", "Calle Falsa No 123", new ArrayList<Employee>(), new ArrayList<Transaction>(), new Date(), new Date());
        return miEmpresa.toString();
    }
}
