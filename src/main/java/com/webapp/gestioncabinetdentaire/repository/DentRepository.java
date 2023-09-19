package com.webapp.gestioncabinetdentaire.repository;

import com.webapp.gestioncabinetdentaire.model.Dent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentRepository extends JpaRepository<Dent, Integer> {
}
