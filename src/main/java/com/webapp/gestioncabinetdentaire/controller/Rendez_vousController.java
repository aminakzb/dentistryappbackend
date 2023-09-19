package com.webapp.gestioncabinetdentaire.controller;

import com.webapp.gestioncabinetdentaire.model.Rendez_vous;
import com.webapp.gestioncabinetdentaire.service.Rendez_vousService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/Rendez-Vous")
public class Rendez_vousController {

    private final Rendez_vousService rendezVousService;

    public Rendez_vousController(Rendez_vousService rendezVousService) {
        this.rendezVousService = rendezVousService;
    }

    @GetMapping("/events")
    public List<Map<String, String>> getCalendarEvents() {
        List<Map<String, String>> events = new ArrayList<>();

        Map<String, String> event = new HashMap<>();
        event.put("title", "Event name");
        event.put("start", "2021-04-11");

        events.add(event);

        return events;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Rendez_vous>> getAllRendez_vous () {
        List<Rendez_vous> rendezVous = rendezVousService.findAllRendez_vous();
        return new ResponseEntity<>(rendezVous, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Rendez_vous> addRendez_vous(@RequestBody Rendez_vous rendezVous){
        Rendez_vous newRendez_vous=rendezVousService.addRendez_vous(rendezVous);
        return new ResponseEntity<>(newRendez_vous,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Rendez_vous> updateRendez_vous(@RequestBody Rendez_vous rendezVous) {
        Rendez_vous updateRendez_vous = rendezVousService.updateRendez_vous(rendezVous);
        return new ResponseEntity<>(updateRendez_vous, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteRendez_vous(@RequestBody Rendez_vous rendezVous) {
        rendezVousService.deleteRendez_vous(rendezVous);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/rendezVous/{id}")
    public ResponseEntity<Optional<Rendez_vous>> getInfosRendez_vousDuPatient (@PathVariable("id")String id) {
        Optional<Rendez_vous> rendezVous = Optional.ofNullable(rendezVousService.findRendezVousByPersonne(id));
        return new ResponseEntity<>(rendezVous, HttpStatus.OK);
    }
}
