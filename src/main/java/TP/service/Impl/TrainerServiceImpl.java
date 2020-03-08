package TP.service.Impl;

import TP.bo.Trainer;
import TP.repository.TrainerRepository;
import TP.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TrainerServiceImpl implements TrainerService {

    private TrainerRepository trainerRepository;

    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public Iterable<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }

    @Override
    public Trainer getTrainer(String name) {
         Optional<Trainer> t = trainerRepository.findById(name);
         if (t.isPresent()){
             return t.get();
         }else{
             return null;
         }
    }

    @Override
    public Trainer createTrainer(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    @Override
    public void updateTrainer(Trainer trainer) {
        this.trainerRepository.save(trainer);
    }

    @Override
    public void deleteTrainerByName(String trainerName) {
        this.trainerRepository.delete(getTrainer(trainerName));
    }
}
