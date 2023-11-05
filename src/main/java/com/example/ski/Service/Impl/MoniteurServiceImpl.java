package com.example.ski.Service.Impl;

import com.example.ski.Models.Moniteur;
import com.example.ski.Models.Support;
import com.example.ski.Service.MoniteurService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoniteurServiceImpl implements MoniteurService {
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return null;
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return null;
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return null;
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return null;
    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCours) {
        return null;
    }

    @Override
    public List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support) {
        return null;
    }
}
