package com.webapp.gestioncabinetdentaire.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dentiste")
@Data
public class Dentiste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddentiste;
    private String email;
    @Column(name = "mot_de_passe")
    private String motDePasse;
    private String adresse;
}
