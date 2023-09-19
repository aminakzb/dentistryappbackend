package com.webapp.gestioncabinetdentaire.service;

import com.webapp.gestioncabinetdentaire.model.Dossier_medical;
import com.webapp.gestioncabinetdentaire.repository.Dossier_medicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Dossier_medicalService {

    final Dossier_medicalRepository dossierMedicalRepository;

    @Autowired
    private Dossier_medicalService(Dossier_medicalRepository dossierMedicalRepository){
        this.dossierMedicalRepository=dossierMedicalRepository;
    }

    public Dossier_medical updateDossierMedical(Dossier_medical dossierMedical){
        return dossierMedicalRepository.save(dossierMedical);
    }

    public Optional<Dossier_medical> findByNum_patient(Integer numPatient){
        return Optional.ofNullable(dossierMedicalRepository.findByNumPatient(numPatient));
    }
}
