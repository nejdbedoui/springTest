package com.example.ski.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;

    @ManyToMany(mappedBy = "skieurs")
    private Set<Piste> pistes;

    @OneToMany(mappedBy = "skieur")
    private Set<Inscription> inscriptions;
    @OneToOne(cascade = CascadeType.REMOVE)
    private Abonnement abonnement;

}
