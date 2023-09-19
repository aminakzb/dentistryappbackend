package com.webapp.gestioncabinetdentaire.repository;

import com.webapp.gestioncabinetdentaire.model.Consultation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ConsultationRepository extends JpaRepository<Consultation, Integer> {
}
