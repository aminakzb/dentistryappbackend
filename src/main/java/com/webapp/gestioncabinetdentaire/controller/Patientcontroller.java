package com.webapp.gestioncabinetdentaire.controller;

import com.webapp.gestioncabinetdentaire.model.Patient;
import com.webapp.gestioncabinetdentaire.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class Patientcontroller {

    private final PatientService patientService;

    public Patientcontroller(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Patient>> getAllPatients () {
        List<Patient> patients = patientService.findAllPatients();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }

    @PostMapping("/patients")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient){
        Patient newPatient=patientService.addPatient(patient);
        return new ResponseEntity<>(newPatient,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient) {
        Patient updatePatient = patientService.updatePatient(patient);
        return new ResponseEntity<>(updatePatient, HttpStatus.OK);
    }

    @GetMapping("/patient/{id}")
    public Optional<Optional<Patient>> findByNumPatient(Integer numPatient){
        return Optional.ofNullable(patientService.findByNumPatient(numPatient));
    }
}
