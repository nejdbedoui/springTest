package com.example.ski.Service;

import com.example.ski.Models.Skieur;
import com.example.ski.Models.TypeAbonnement;

import java.util.List;

public interface SkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCours);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
}
