package com.webapp.gestioncabinetdentaire.service;

import com.webapp.gestioncabinetdentaire.model.Acte;
import com.webapp.gestioncabinetdentaire.repository.ActeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActesService {
    final ActeRepository acteRepository;

    @Autowired
    private ActesService(ActeRepository acteRepository){
        this.acteRepository=acteRepository;
    }

    public List<Acte> findAllActes(){
        return acteRepository.findAll();
    }

    public Acte updateActe(Acte acte){
        return acteRepository.save(acte);
    }

    public Acte addActe(Acte acte){
        return acteRepository.save(acte);
    }
}
