package com.webapp.gestioncabinetdentaire.service;

import com.webapp.gestioncabinetdentaire.model.Dent;
import com.webapp.gestioncabinetdentaire.model.Rendez_vous;
import com.webapp.gestioncabinetdentaire.repository.Rendez_vousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Rendez_vousService {

    final Rendez_vousRepository rendezVousRepository;

    @Autowired
    private Rendez_vousService(Rendez_vousRepository rendezVousRepository){
        this.rendezVousRepository=rendezVousRepository;
    }

    public Rendez_vous addRendez_vous(Rendez_vous rendezVous){
        return rendezVousRepository.save(rendezVous);
    }

    public Rendez_vous updateRendez_vous(Rendez_vous rendezVous){
        return rendezVousRepository.save(rendezVous);
    }

    public List<Rendez_vous> findAllRendez_vous(){
        return rendezVousRepository.findAll();
    }

    public Rendez_vous findRendezVousByPersonne(String personne){
        return rendezVousRepository.findRendezVousByPersonne(personne);
    }
    public void deleteRendez_vous(Rendez_vous rendezVous){
        rendezVousRepository.delete(rendezVous);
    }
}
