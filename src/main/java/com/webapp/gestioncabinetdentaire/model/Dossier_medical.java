package com.webapp.gestioncabinetdentaire.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Blob;

@Entity
@Table(name = "dossier_medical")
@Data
public class Dossier_medical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dossier_medical")
    private Integer idDossierMedical ;
    @Column(name = "num_patient")
    private Integer numPatient ;
    @Column(name="dents_traitees")
    private Integer dentsTraitees;
    @Column(name="dents_absentes")
    private Integer dentsAbsentes;
    @Column(name="dents_restantes_atraiter")
    private Integer dentsRestantesATraiter;
    private Integer carries;
    @Column(name="etat_general_patient")
    private String etatGeneralPatient;
    @Column(name="habitude_vie")
    private String habitudeVie;
    @Column(name="histoire_maladie")
    private String histoireMaladie;
    @Column(name = "précautions")
    private String precautions;
    @Lob
    @Column(name = "radios")
    private byte[] radios;


}
