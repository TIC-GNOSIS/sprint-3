package com.proyecto.sprint3.repository;

import com.proyecto.sprint3.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository <Transaction, Long> {

}
