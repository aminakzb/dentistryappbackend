package com.webapp.gestioncabinetdentaire.controller;

import com.webapp.gestioncabinetdentaire.model.Acte;
import com.webapp.gestioncabinetdentaire.service.ActesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Actes")
public class ActeController {

    private final ActesService actesService;


    public ActeController(ActesService actesService) {
        this.actesService = actesService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Acte>> getAllActes () {
        List<Acte> actes = actesService.findAllActes();
        return new ResponseEntity<>(actes, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Acte> addActe(@RequestBody Acte acte){
        Acte newActe=actesService.addActe(acte);
        return new ResponseEntity<>(newActe,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Acte> updateActe(@RequestBody Acte acte) {
        Acte updateActe = actesService.updateActe(acte);
        return new ResponseEntity<>(updateActe, HttpStatus.OK);
    }

}
