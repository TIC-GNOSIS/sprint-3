package com.proyecto.sprint3.controller;
import com.proyecto.sprint3.entity.Employee;
import com.proyecto.sprint3.entity.Enterprise;
import com.proyecto.sprint3.entity.Transaction;
import com.proyecto.sprint3.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class EnterpriseController {

    @Autowired
    private EnterpriseService servicio;
    @GetMapping("/enterprise")
    public String generarEnterprise(){
        Enterprise miEmpresa = new Enterprise(123L, "Amauta", "411500123", "3185023040", "calle 93 sur 20-40", new ArrayList<Employee>(), new ArrayList<Transaction>(), new Date(), new Date());
        return miEmpresa.toString();
    }

    @PostMapping("/enterprise")
    public void guardarEmployee(@RequestBody Enterprise enterprise){
        servicio.guardarEmpresa(enterprise);
    }

    @PutMapping("/enterprise")
    public ResponseEntity<?> actualizarEnterprise(@RequestBody Enterprise enterprise, @PathVariable Long id){
        Enterprise enterpriseExistente = servicio.buscarEmpresaPorId(id);
        servicio.guardarEmpresa(enterprise);
        return new ResponseEntity<Enterprise>(enterprise, HttpStatus.OK);
    }

    @DeleteMapping("/enterprise")
    public void eliminarEnterprise(@PathVariable Long id){
        servicio.eliminarEmpresa(id);
    }

}
