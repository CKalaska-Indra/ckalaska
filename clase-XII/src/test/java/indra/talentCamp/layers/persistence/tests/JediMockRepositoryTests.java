package indra.talentCamp.layers.persistence.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistence.JediMockRepository;
import indra.talentCamp.layers.persistence.NotFoundException;

class JediMockRepositoryTests {

	@Test
	void shouldThrowAnExceptionIfNotFound() {
		JediMockRepository repo = new JediMockRepository();
		assertThrows(NotFoundException.class, ()->repo.findById(23));
	}
	
	@Test
	void shouldSaveAnThenFind() throws NotFoundException {
		JediMockRepository repo = new JediMockRepository();

		Jedi joda = new Jedi("Joda", 10000, Color.GREEN);
		repo.save(joda);
		Jedi jodaRenacido = repo.findById(1);
		
		assertEquals(joda.getNombre(), jodaRenacido.getNombre());
	}

}
