package com.proyecto.sprint3.controller;
import com.proyecto.sprint3.entity.Enterprise;
import com.proyecto.sprint3.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EnterpriseController {

    @Autowired
    private EnterpriseService servicio;

    @GetMapping("/enterprise")
    public List<Enterprise> generarEnterprise() {
        return servicio.listarEmpresa();
    }


    @PostMapping("/enterprise")
    public void guardarEmployee(@RequestBody Enterprise enterprise) {
        servicio.guardarEmpresa(enterprise);
    }

    @PatchMapping("/enterprise/{id}")
    public ResponseEntity<?> actualizarEnterprise(@RequestBody Enterprise enterprise, @PathVariable Long id) {
        Enterprise enterpriseExistente = servicio.buscarEmpresaPorId(id);
        servicio.guardarEmpresa(enterprise);
        return new ResponseEntity<Enterprise>(enterprise, HttpStatus.OK);
    }

    @DeleteMapping("/enterprise/{id}")
    public void eliminarEnterprise(@PathVariable("id") Long id) {
        servicio.eliminarEmpresa(id);
    }
}