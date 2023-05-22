package indra.talentCamp.claseX;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Manejo de fechas
		LocalDate fecha = LocalDate.now();
		
		LocalDateTime fechayHora = LocalDateTime.now();
		
		LocalDate cumpleaños = LocalDate.of(2023,  Month.NOVEMBER, 16);
		System.out.format("Feliz día %d del %d", 
				cumpleaños.getDayOfMonth(),
				cumpleaños.getMonthValue());
		
		LocalDate navidad = LocalDate.of(2023,  Month.DECEMBER, 25);
		Period periodo = Period.between(cumpleaños, navidad);
		System.out.format("Hay %d años, %d meses, %dias entre mi cumpleaños y navidad",
				periodo.getYears(), periodo.getMonths(), periodo.getDays());
		
		//Manejo de Strings
		String txt = "Hola que tal como estan todos";
		List<String> palabras = Arrays.asList(txt.split(" "));
		palabras.forEach(System.out::println);

		
		//Diccionarios
		Map<String, String> diccionario = new HashMap<>();
		diccionario.put("casa", "Lugar donde vive la gente");
		if(!diccionario.containsKey("auto")) {
			diccionario.put("auto","vehiculo que te lleva de un lado a otro");
		}
		
		for (var entrada : diccionario.entrySet()) {
			System.out.println(entrada.getKey() + " : "+entrada.getValue());
		}
		
		String texto = "Hola buenos dias cuantos buenos dias buenos";
		List<String> totalPalabras = Arrays.asList(txt.split(" "));
		Map<String, String> diccionario1 = new HashMap<>();
		/*
		for (int i=0; i<totalPalabras.size(); i++) {
			String palabra = totalPalabras[i];
			if (!diccionario1.containsKey(palabra)) {
				diccionario1.put(palabra,"1");
			}
			else {
				int valor = Integer.parseInt(diccionario1.get(palabra));
				valor++;
				diccionario1.put(palabra, Integer.toString(valor));
			}
		}
		for (var entrada : diccionario.entrySet()) {
			System.out.println(entrada.getKey() + " : "+entrada.getValue());
		}*/
		
		//Ejmplo de Set
		Set<String> conjunto = new HashSet<>();
		conjunto.add("Casa");
		conjunto.add("Casa");
		conjunto.add("Casa");
		conjunto.add("Mesa");
		conjunto.add("Mesa");
		conjunto.add("Mesa");

		System.out.println(conjunto.size());
		for (var e : conjunto) {
			System.out.println(e);
		}
		
		//Priority Queue  El elemento mas bajo es el que tiene mayor prioridad
		Queue<Integer> prioridades = new PriorityQueue<>();
		prioridades.offer(9);
		prioridades.offer(19);
		prioridades.offer(93);
		prioridades.offer(59);
		prioridades.offer(92);
		System.out.println("Valor mas prioritario :"+prioridades.poll());

	}

}
