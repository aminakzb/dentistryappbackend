package com.webapp.gestioncabinetdentaire.service;

import com.webapp.gestioncabinetdentaire.model.Dent;
import com.webapp.gestioncabinetdentaire.model.Patient;
import com.webapp.gestioncabinetdentaire.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    final PatientRepository patientRepository;

    @Autowired
    private PatientService(PatientRepository patientRepository){
        this.patientRepository=patientRepository;
    }

    public Patient addPatient(Patient patient){
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Patient patient){
        return patientRepository.save(patient);
    }

    public List<Patient> findAllPatients(){
        return patientRepository.findAll();
    }

    public Optional<Patient> findByNumPatient(Integer numPatient){

        return patientRepository.findById(numPatient);
    }
}
