package com.example.ski.Service.Impl;

import com.example.ski.Models.Abonnement;
import com.example.ski.Models.TypeAbonnement;
import com.example.ski.Service.AbonnementService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Flow;

@Service
public class AbonnementServiceImpl implements AbonnementService {
    @Override
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement type) {
        return null;
    }

    @Override
    public List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return null;
    }

    @Override
    public void retrieveSubscriptions() {

    }
}
