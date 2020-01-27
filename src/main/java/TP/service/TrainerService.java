package TP.service;

import TP.bo.Trainer;

import java.util.Optional;

public interface TrainerService {
    Iterable<Trainer> getAllTrainers();
    Optional<Trainer> getTrainer(String name);
    Trainer createTrainer(Trainer trainer);
}

