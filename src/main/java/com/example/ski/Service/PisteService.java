package com.example.ski.Service;

import com.example.ski.Models.Piste;

import java.util.List;

public interface PisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
}
