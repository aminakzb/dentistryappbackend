package com.webapp.gestioncabinetdentaire.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dent")
@Data
public class Dent {
    @Id
    @Column(name = "num_dent")
    private Integer numDent;
    private String acte;


}
