package com.webapp.gestioncabinetdentaire.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "rendez_vous")
@Data
public class Rendez_vous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrendez_vous")
    private Integer idRendezVous;
    @Column(name ="date")
    private Date dateRendezVous;
    private String personne;
    @Column(name ="motif")
    private String motifRendezVous;
    private String statut;

}
