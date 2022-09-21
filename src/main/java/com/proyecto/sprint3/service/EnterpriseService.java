package com.proyecto.sprint3.service;

import com.proyecto.sprint3.entity.Employee;
import com.proyecto.sprint3.entity.Enterprise;
import com.proyecto.sprint3.repository.EmployeeRepository;
import com.proyecto.sprint3.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnterpriseService {
    @Autowired
    private EnterpriseRepository repositorio;

    public List<Enterprise> listarEmpresa(){
        return repositorio.findAll();

    }

    public void guardarEmpresa(Enterprise empresa){
        repositorio.save(empresa);
    }

    public Enterprise buscarEmpresaPorId(Long id){
        return repositorio.findById(id).get();

    }

    public void eliminarEmpresa(Long id){
        repositorio.deleteById(id);
    }
}
