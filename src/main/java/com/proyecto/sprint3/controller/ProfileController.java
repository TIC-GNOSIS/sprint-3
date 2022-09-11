package com.proyecto.sprint3.controller;

import com.proyecto.sprint3.entity.Employee;
import com.proyecto.sprint3.entity.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ProfileController {
    @GetMapping("/profile")
    public String generarProfile(){
        Profile miProfile = new Profile("159", "image.jpg", "3015874962", new Employee(), new Date(), new Date());
        return miProfile.toString();
    }

}
