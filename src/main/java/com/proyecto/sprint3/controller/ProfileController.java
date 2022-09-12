package com.proyecto.sprint3.controller;

import com.proyecto.sprint3.entity.Employee;
import com.proyecto.sprint3.entity.Profile;
import com.proyecto.sprint3.entity.Transaction;
import com.proyecto.sprint3.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class ProfileController {

    @Autowired
    private ProfileService servicio;
    @GetMapping("/profile")
    public String generarProfile(){
        Profile miProfile = new Profile("159", "image.jpg", "3185023040", new Employee(), new Date(), new Date());
        return miProfile.toString();
    }

    @PostMapping("/profile")
    public void guardarProfile(@RequestBody Profile profile){
        servicio.guardarPerfile(profile);
    }

    @PutMapping("/profile")
    public ResponseEntity<?> actualizarProfile(@RequestBody Profile profile, @PathVariable String id){
        Profile profileExistente = servicio.buscarPerfilPorId(id);
        servicio.guardarPerfile(profile);
        return new ResponseEntity<Transaction>((MultiValueMap<String, String>) profile, HttpStatus.OK);
    }

    @DeleteMapping("/profile")
    public void eliminarProfile(@PathVariable String id){
        servicio.eliminarPerfil(id);
    }


}
