package com.example.ski.Service.Impl;

import com.example.ski.Models.Inscription;
import com.example.ski.Service.InscriptionService;
import org.springframework.stereotype.Service;

@Service
public class InscriptionServiceImpl implements InscriptionService {
    @Override
    public Inscription addRegistrationAndAssignToSkier(Inscription inscription, Long numSkieur) {
        return null;
    }

    @Override
    public Inscription assignRegistrationToCourse(Long numInscription, Long numCours) {
        return null;
    }

    @Override
    public Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours) {
        return null;
    }
}
