package com.example.ski.Service;

import com.example.ski.Models.Cours;

import java.util.List;

public interface CoursService {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
}
