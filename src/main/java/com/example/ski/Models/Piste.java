package com.example.ski.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long numPiste;
    private String nomPiste;
    private Couleur couleur;
    private int longeur;
    private int pente;

    @ManyToMany
    private Set<Skieur> skieurs;

}
