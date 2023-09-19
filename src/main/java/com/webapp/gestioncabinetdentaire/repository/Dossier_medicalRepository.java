package com.webapp.gestioncabinetdentaire.repository;

import com.webapp.gestioncabinetdentaire.model.Dossier_medical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dossier_medicalRepository extends JpaRepository<Dossier_medical, Integer> {
    Dossier_medical findByNumPatient(Integer numPatient);
}
