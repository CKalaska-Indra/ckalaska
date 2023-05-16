package indra.talentCamp.polimorfismo;

import java.util.ArrayList;
import java.util.List;

import indra.talentCamp.polimorfismo.models.Guerrero;
import indra.talentCamp.polimorfismo.models.Jugador;
import indra.talentCamp.polimorfismo.models.Mago;

public class Program {

	public static void main(String[] args) {
		Jugador excalibur = new Guerrero("Excalibur");
		Guerrero batman = new Guerrero("Batman");
		Jugador thanos = new Mago("thanos");
		
		List<Jugador> personajes = new ArrayList<Jugador>();
		personajes.add(excalibur);
		personajes.add(batman);
		personajes.add(thanos);
		//Comienzo del turno
		System.out.println("Comienzo del turno");
		personajes.forEach(System.out::println);

		batman.accion(excalibur);
		thanos.accion(excalibur);
		
		
		personajes.forEach(System.out::println);
		
		personajes.forEach(p->p.finalizarTurno());
		//Fin del turno
		System.out.println("Fin del turno");
		
		//Mostrar todos los jugadores que estan vivos con expresion lambda
		personajes.stream().filter(n -> n.estaVivo()).forEach(System.out::println);	
	}
}
