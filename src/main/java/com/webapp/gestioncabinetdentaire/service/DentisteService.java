package com.webapp.gestioncabinetdentaire.service;

import com.webapp.gestioncabinetdentaire.model.Dentiste;
import com.webapp.gestioncabinetdentaire.repository.DentisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DentisteService {

    final DentisteRepository dentisteRepository;

    @Autowired
    private DentisteService(DentisteRepository dentisteRepository) {
        this.dentisteRepository = dentisteRepository;
    }

    public Dentiste updateDentiste(Dentiste dentiste) {
        return dentisteRepository.save(dentiste);
    }

    public Boolean login(Dentiste dentisteData) {
        Optional<Dentiste> dentisteOptional = Optional
                .ofNullable(dentisteRepository
                        .findByEmailAndMotDePasse(dentisteData.getEmail(),dentisteData.getMotDePasse()));
        return dentisteOptional.isPresent();
    }
}
