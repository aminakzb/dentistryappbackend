package com.webapp.gestioncabinetdentaire.repository;

import com.webapp.gestioncabinetdentaire.model.Dentiste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

@Repository
public interface DentisteRepository extends JpaRepository<Dentiste, Integer> {

 Dentiste findByEmailAndMotDePasse(String email, String motDePasse);


}
