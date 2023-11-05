package com.example.ski.Service.Impl;

import com.example.ski.Models.Skieur;
import com.example.ski.Models.TypeAbonnement;
import com.example.ski.Service.SkieurService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkieurServiceImpl implements SkieurService {
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return null;
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return null;
    }

    @Override
    public void removeSkieur(Long numSkieur) {

    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return null;
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        return null;
    }

    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCours) {
        return null;
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return null;
    }
}
