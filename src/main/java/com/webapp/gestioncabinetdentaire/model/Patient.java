package com.webapp.gestioncabinetdentaire.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "patient")
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpatient ;

    private String nom;
    private String prenom;
    private String cin;
    @Column(name = "date_naissance")
    private Date dateNaissance;
    private String tel;
    private String age;
    private String adresse;
    private String profession;
    @Column(name = "situation_familiale")
    private String situationFamiliale;
    private String assurance ;
    @Column(name = "antecedant_chi/med")
    private String antecedantMedicaux;
    private String allergie;


}
