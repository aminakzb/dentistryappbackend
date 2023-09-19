package com.webapp.gestioncabinetdentaire.service;

import com.webapp.gestioncabinetdentaire.model.Dent;
import com.webapp.gestioncabinetdentaire.repository.DentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DentService {

    final DentRepository dentRepository;

    @Autowired
    private DentService(DentRepository dentRepository){
        this.dentRepository=dentRepository;
    }

    public Dent addDent(Dent dent){
        return dentRepository.save(dent);
    }

    public Dent updateDent(Dent dent){
        return dentRepository.save(dent);
    }

    public List<Dent> findAllDents(){
        return dentRepository.findAll();
    }

    public Optional<Dent> findByNumDent(Integer numDent){
        return dentRepository.findById(numDent);
    }
    public void deleteDent(Dent dent){
         dentRepository.delete(dent);
    }
}
