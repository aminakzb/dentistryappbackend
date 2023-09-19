package com.webapp.gestioncabinetdentaire.controller;

import com.webapp.gestioncabinetdentaire.model.Consultation;
import com.webapp.gestioncabinetdentaire.model.Dent;
import com.webapp.gestioncabinetdentaire.service.DentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Dents")
public class DentController {

    private final DentService dentService;

    public DentController(DentService dentService) {
        this.dentService = dentService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Dent>> getAllDents () {
        List<Dent> dents = dentService.findAllDents();
        return new ResponseEntity<>(dents, HttpStatus.OK);
    }
    @GetMapping("/dent/{id}")
    public ResponseEntity<Optional<Dent>> getInfosDent (@PathVariable("id")Integer id) {
        Optional<Dent> dent = dentService.findByNumDent(id);
        return new ResponseEntity<>(dent, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Dent> addDent(@RequestBody Dent dent){
        Dent newDent=dentService.addDent(dent);
        return new ResponseEntity<>(newDent,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Dent> updateDent(@RequestBody Dent dent) {
        Dent updateDent = dentService.updateDent(dent);
        return new ResponseEntity<>(updateDent, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteDent(@RequestBody Dent dent) {
        dentService.deleteDent(dent);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
