package indra.talentCamp.ejercicio;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {


		Gato gato = new Gato();
		Perro perro = new Perro();
		Vaca vaca = new Vaca();
		
		List<Animal> animales = Arrays.asList(gato, perro, vaca);
		animales.forEach(System.out::println);
	}

}
