package com.webapp.gestioncabinetdentaire.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "consultation")
@Data
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idconsultation ;
    @Column(name = "nom_patient")
    private String nomPatient;
    @Column(name = "total_a_payer")
    private float totalAPayer;
    private float paye;
    @Column(name = "reste_a_payer")
    private float resteAPayer;
    @Column(name = "motif_consult")
    private String motifConsultation;
    @Column(name = "date_consult")
    private Date dateConsultation;
}
