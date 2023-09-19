package com.webapp.gestioncabinetdentaire.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "acte")
@Data
public class Acte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idacte;
    @Column(name = "num_dent")
    private Integer numDent;
    private float prix;
    @Column(name ="date")
    private Date dateActe;
    @Column(name = "statut_acte")
    private String statutActe;
    private String couleur;
}
