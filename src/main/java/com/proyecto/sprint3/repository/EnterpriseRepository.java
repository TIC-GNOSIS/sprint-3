package com.proyecto.sprint3.repository;

import com.proyecto.sprint3.entity.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends JpaRepository <Enterprise, Long>{

}
