package TP.service;

import TP.bo.Trainer;

public interface TrainerService {
    Iterable<Trainer> getAllTrainers();
    Trainer getTrainer(String name);
    Trainer createTrainer(Trainer trainer);
    void updateTrainer(Trainer trainer);
    void deleteTrainerByName(String trainerName);
}

