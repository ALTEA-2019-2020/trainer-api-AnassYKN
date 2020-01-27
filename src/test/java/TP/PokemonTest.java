package TP;

import TP.bo.Pokemon;
import org.junit.jupiter.api.Test;

import javax.persistence.Embeddable;

import static org.junit.Assert.assertNotNull;

public class PokemonTest {

    @Test
    void pokemon_shouldBeAnEmbeddable(){
        assertNotNull(Pokemon.class.getAnnotation(Embeddable.class));
    }
}
