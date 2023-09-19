package com.webapp.gestioncabinetdentaire.controller;

import com.webapp.gestioncabinetdentaire.model.Dentiste;
import com.webapp.gestioncabinetdentaire.service.DentisteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/Dentiste")
public class DentisteController {

private final DentisteService dentisteService;

    public DentisteController(DentisteService dentisteService) {
        this.dentisteService = dentisteService;
    }

    @PostMapping("/login")
   public ResponseEntity<?> login(@RequestBody Dentiste dentiste){
        System.out.println(dentiste);
     Boolean loginDentiste=dentisteService.login(dentiste);
     if(loginDentiste)
         return ResponseEntity.ok(dentiste);
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
   }

    @GetMapping("")
    public ModelAndView redirectToLogin() {
        return new ModelAndView("redirect:/Dentiste/login");
    }


    @PutMapping("/update")
    public ResponseEntity<Dentiste> updateDentiste(@RequestBody Dentiste dentiste) {
        Dentiste updateDentiste = dentisteService.updateDentiste(dentiste);
        return new ResponseEntity<>(updateDentiste, HttpStatus.OK);
    }
}
