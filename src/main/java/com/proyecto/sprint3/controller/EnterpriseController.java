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
        Enterprise miEmpresa = new Enterprise(123L, "Amauta", "411500123", "3185023040", "calle 93 sur 20-40", new ArrayList<Employee>(), new ArrayList<Transaction>(), new Date(), new Date());
        return miEmpresa.toString();
    }
}
