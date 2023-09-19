package com.webapp.gestioncabinetdentaire.controller;

import com.webapp.gestioncabinetdentaire.model.Dent;
import com.webapp.gestioncabinetdentaire.model.Dossier_medical;
import com.webapp.gestioncabinetdentaire.service.Dossier_medicalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/DossierMedical")
public class Dossier_medicalController {

    private final Dossier_medicalService dossierMedicalService;

    public Dossier_medicalController(Dossier_medicalService dossierMedicalService) {
        this.dossierMedicalService = dossierMedicalService;
    }

    @PutMapping("/update")
    public ResponseEntity<Dossier_medical> updateDossier_medical(@RequestBody Dossier_medical dossierMedical) {
        Dossier_medical updateDossier_medicalController = dossierMedicalService.updateDossierMedical(dossierMedical);
        return new ResponseEntity<>(updateDossier_medicalController, HttpStatus.OK);
    }

    @GetMapping("/dossier/{id}")
    public ResponseEntity<Optional<Dossier_medical>> getInfosDossierDuPatient (@PathVariable("id")Integer id) {
        Optional<Dossier_medical> dossierMedical = dossierMedicalService.findByNum_patient(id);
        return new ResponseEntity<>(dossierMedical, HttpStatus.OK);
    }
}
