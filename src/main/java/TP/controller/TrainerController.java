package TP.controller;

import TP.bo.Trainer;
import TP.service.TrainerService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/trainers")
public class TrainerController {

    private final TrainerService trainerService;

    TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @GetMapping("/")
    public Iterable<Trainer> getAllTrainers(){
        return this.trainerService.getAllTrainers();
    }

    @GetMapping("/{name}")
    public Trainer getTrainer(@PathVariable String name){
      return this.trainerService.getTrainer(name);
    }

    @PostMapping(value="/")
    public Trainer createTrainer(@RequestBody Trainer trainer){
        this.trainerService.createTrainer(trainer);
        return trainer;
    }

    @PutMapping("/")
    public Trainer updateTrainer(@RequestBody Trainer trainer) {
        this.trainerService.updateTrainer(trainer);
        return trainer;
    }

    @DeleteMapping("/{trainerName}")
    public String deleteTrainer(@PathVariable("trainerName") String trainerName) {
        this.trainerService.deleteTrainerByName(trainerName);
        return trainerName + " was deleted";
    }

}
