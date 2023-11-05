package com.example.ski.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numInscription;
    private int numSemaine;

    @ManyToOne
    private Skieur skieur;

    @ManyToOne
    private Cours cours;
}
