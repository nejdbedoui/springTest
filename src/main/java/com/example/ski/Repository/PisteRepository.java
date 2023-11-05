package com.example.ski.Repository;

import com.example.ski.Models.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PisteRepository extends JpaRepository<Piste, Long> {
}
