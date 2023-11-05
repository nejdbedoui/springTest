package com.example.ski.Service;

import com.example.ski.Models.Abonnement;
import com.example.ski.Models.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Flow;

public interface AbonnementService {
    Set<Abonnement> getSubscriptionByType(TypeAbonnement type);
    List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);
    void retrieveSubscriptions();
}
