package indra.talentCamp.maven.persistence;

import java.util.ArrayList;
import java.util.List;

import indra.talentCamp.maven.models.Persona;

public class PersonaRepository {

	public List<Persona> findAll(){
		//Recupera todas las personas de la base de datos
		//return new ArrayList<>(); >>>> tira error por la version de java
		return new ArrayList<Persona>();
	}
	
	public void save(Persona p) {
		//Guarda la persona en la base de datos, archivo, lo que sea
		//INSERT INTO
	}
	
	public void update(Persona p) {
		//Actualiza una persona
		//UPDATE...
		
	}
	
	public void delete(Persona p) {
		//Borra la persona
		//DELETE FROM
	}
	
	
	
}
