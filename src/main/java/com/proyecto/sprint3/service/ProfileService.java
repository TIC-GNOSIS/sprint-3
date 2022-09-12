package com.proyecto.sprint3.service;

import com.proyecto.sprint3.entity.Enterprise;
import com.proyecto.sprint3.entity.Profile;
import com.proyecto.sprint3.repository.EnterpriseRepository;
import com.proyecto.sprint3.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfileService {
    @Autowired
    private ProfileRepository repositorio;

    public List<Profile> listarPerfiles(){
        return repositorio.findAll();

    }

    public void guardarPerfile(Profile Perfil){
        repositorio.save(Perfil);
    }

    public Profile buscarPerfilPorId(String id){
        return repositorio.findById(id).get();

    }

    public void eliminarPerfil(String id){
        repositorio.deleteById(id);
    }
}
