package com.webapp.gestioncabinetdentaire.controller;

import com.webapp.gestioncabinetdentaire.model.Consultation;
import com.webapp.gestioncabinetdentaire.service.ConsultationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Consultations")
public class ConsultationController {
     final ConsultationService consultationService;

    public ConsultationController( ConsultationService consultationService) {
        this.consultationService = consultationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Consultation>> getAllConsultations () {
        List<Consultation> consultations = consultationService.findAllConsultations();
        return new ResponseEntity<>(consultations, HttpStatus.OK);
    }

    @PostMapping ("/add")
    public ResponseEntity<Consultation> addConsultation(@RequestBody Consultation consultation){
        Consultation newConsultation=consultationService.addConsultation(consultation);
        return new ResponseEntity<>(newConsultation,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Consultation> updateConsultation(@RequestBody Consultation consultation) {
        Consultation updateConsultation = consultationService.updateConsultation(consultation);
        return new ResponseEntity<>(updateConsultation, HttpStatus.OK);
    }

}
