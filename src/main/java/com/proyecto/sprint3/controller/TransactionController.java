package com.proyecto.sprint3.controller;

import com.proyecto.sprint3.entity.Employee;
import com.proyecto.sprint3.entity.Enterprise;
import com.proyecto.sprint3.entity.Transaction;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

public class TransactionController {
    @GetMapping("/transaction")
    public String generarTransaction(){
        Transaction miTransaction = new Transaction(786L, "Pago arriendo", 1500000, new Employee(), new Enterprise(), new Date(), new Date());
        return miTransaction.toString();
    }
}
