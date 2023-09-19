package com.webapp.gestioncabinetdentaire.repository;

import com.webapp.gestioncabinetdentaire.model.Acte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActeRepository extends JpaRepository <Acte, Integer>{
}
