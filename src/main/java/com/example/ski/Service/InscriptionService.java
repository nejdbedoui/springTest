package com.example.ski.Service;

import com.example.ski.Models.Inscription;

public interface InscriptionService {
    Inscription addRegistrationAndAssignToSkier(Inscription inscription, Long numSkieur);
    Inscription assignRegistrationToCourse(Long numInscription, Long numCours);
    Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours);
}
