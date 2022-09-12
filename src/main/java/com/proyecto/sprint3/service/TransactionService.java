package com.proyecto.sprint3.service;

import com.proyecto.sprint3.entity.Enterprise;
import com.proyecto.sprint3.entity.Transaction;
import com.proyecto.sprint3.repository.EnterpriseRepository;
import com.proyecto.sprint3.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repositorio;

    public List<Transaction> listarMovimientos(){
        return repositorio.findAll();

    }

    public void guardarMovimientos(Transaction Movimientos){
        repositorio.save(Movimientos);
    }

    public Transaction buscarMovimientosPorId(long id){
        return repositorio.findById(id).get();

    }

    public void eliminarMovimientos(long id){
        repositorio.deleteById(id);
    }
}
