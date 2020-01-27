package TP;

import TP.bo.Trainer;
import org.junit.jupiter.api.Test;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

import static org.junit.Assert.assertNotNull;

public class TrainerTest {
    @Test
    void trainer_shouldBeAnEntity(){
        assertNotNull(Trainer.class.getAnnotation(Entity.class));
    }

    @Test
    void trainerName_shouldBeAnId() throws NoSuchFieldException {
        assertNotNull(Trainer.class.getDeclaredField("name").getAnnotation(Id.class));
    }

    @Test
    void trainerTeam_shouldBeAElementCollection() throws NoSuchFieldException {
        assertNotNull(Trainer.class.getDeclaredField("team").getAnnotation(ElementCollection.class));
    }
}
