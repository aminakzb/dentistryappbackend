package com.webapp.gestioncabinetdentaire.repository;

import com.webapp.gestioncabinetdentaire.model.Rendez_vous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rendez_vousRepository extends JpaRepository<Rendez_vous, Integer> {
    Rendez_vous findRendezVousByPersonne(String personne);
}
