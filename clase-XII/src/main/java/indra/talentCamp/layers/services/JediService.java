package indra.talentCamp.layers.services;

import java.awt.Color;
import java.util.Random;

import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistence.JediMockRepository;
import indra.talentCamp.layers.persistence.SaveErrorException;
import indra.talentCamp.layers.persistence.interfaces.Repository;

public class JediService {
	
	private Repository<Jedi> repository;
	
	public JediService(Repository<Jedi> repo) {
		//this.repository = new JediMockRepository();
		//this.repository = new JediFileRepository();
		//Para que el servicio pueda trabajar con cualquier tipo de repo
		this.repository = repo;

	}

	private int calcularNivelFuerza(Jedi j) {
		return new Random().nextInt(1000,100000);
	}
	
	private Color crearSableNuevo() {
		return Color.GREEN;
	}
	
	public void alistar(String nombre) throws SaveErrorException {
		Jedi nuevo = new Jedi(nombre, this.crearSableNuevo());
		nuevo.setNivelDeFuerza(this.calcularNivelFuerza(nuevo));
		this.repository.save(nuevo);
	}
}
