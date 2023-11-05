package com.example.ski.Service;

import com.example.ski.Models.Moniteur;
import com.example.ski.Models.Support;

import java.util.List;

public interface MoniteurService {
    List<Moniteur> retrieveAllMoniteurs();

    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCours);
    List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support);
}
