package com.webapp.gestioncabinetdentaire.service;

import com.webapp.gestioncabinetdentaire.model.Consultation;
import com.webapp.gestioncabinetdentaire.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {

    final ConsultationRepository consultationRepository;

    @Autowired
    private ConsultationService(ConsultationRepository consultationRepository){
        this.consultationRepository=consultationRepository;
    }

    public Consultation addConsultation(Consultation consultation){
        return consultationRepository.save(consultation);
    }

    public Consultation updateConsultation(Consultation consultation){
        return consultationRepository.save(consultation);
    }

    public List<Consultation> findAllConsultations(){
        return consultationRepository.findAll();
    }

}
