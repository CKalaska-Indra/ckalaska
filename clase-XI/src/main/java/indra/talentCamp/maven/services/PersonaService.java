package indra.talentCamp.maven.services;

import java.util.List;

import indra.talentCamp.maven.models.Persona;
import indra.talentCamp.maven.persistence.PersonaRepository;

public class PersonaService {
	private PersonaRepository repository;
	
	public PersonaService() {
		this.repository = new PersonaRepository();
	}
	
	public List<Persona> recuperarPersonas(){
		List<Persona> personas = this.repository.findAll();
		//Se pueden realizar las necesidades que convienen
		return personas;
	}
	
	public void registrarPersonaNueva(Persona p) {
		if (p.getNombre()==null) {
			//throw new ValidationException("No tiene nombre");
		}
		this.repository.save(p);
	}
}
