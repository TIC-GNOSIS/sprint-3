package com.proyecto.sprint3.controller;

import com.proyecto.sprint3.entity.Employee;
import com.proyecto.sprint3.entity.Enterprise;
import com.proyecto.sprint3.entity.Transaction;
import com.proyecto.sprint3.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService servicio;
    @GetMapping("/transaction")
    public String generarTransaction(){
        Transaction miTransaction = new Transaction(786L, "Pago arriendo", 1500000, new Employee(), new Enterprise(), new Date(), new Date());
        return miTransaction.toString();
    }

    @PostMapping("/transaction")
    public void guardartransaction(@RequestBody Transaction transaction){
        servicio.guardarMovimientos(transaction);
    }

    @PutMapping("/transaction")
    public ResponseEntity<?> actualizarTransaction(@RequestBody Transaction transaction, @PathVariable Long id){
        Transaction employeeExistente = servicio.buscarMovimientosPorId(id);
        servicio.guardarMovimientos(transaction);
        return new ResponseEntity<Transaction>(transaction, HttpStatus.OK);
    }

    @DeleteMapping("/transaction")
    public void eliminarTransaction(@PathVariable Long id){
        servicio.eliminarMovimientos(id);
    }

}
