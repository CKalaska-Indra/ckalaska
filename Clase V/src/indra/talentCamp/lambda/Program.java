package indra.talentCamp.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import indra.talentCamp.models.Persona;

public class Program {

	public static void main(String[] args) {
		
		//EXPRESIONES LAMBDA -> Buscar LAMBDA CHEAT SHEET
		
		/*
		//Inmutable en memoria
		String frase = "Que la fuerza "+" este contigo";
		
		//Mutable en memoria     Ideal para hacer Strings con mcuchas concatenaciones (bucles)
		StringBuilder builder = new StringBuilder();
		builder.append("Que la fuerza");
		builder.append("este contigo");
		
		System.out.println(builder.toString());*/
		
		//List<Persona> jedis = new ArrayList<Persona>();
		//jedis.add(new Persona("Anakin", 178));

		List<Persona> jedis = Arrays.asList(
				new Persona("Anakin", 178),
				new Persona("Yoda", 80),
				new Persona("Asoka", 165),
				new Persona("Luke", 165));
		
		/*
		System.out.println("La lista de Jedis:");
		for (Persona jedi : jedis) {
			System.out.println(jedi.getNombre());
		}
		//
		//IMPRIMIR LISTA DE PERSONAS CON EXPRESION LAMBDA (1 sola linea)
		//
		jedis.forEach(jedi -> System.out.println(jedi.getNombre()));
		jedis.forEach(System.out::println);*/
		//
		//MAX
		//
		List<Integer> numeros = Arrays.asList(4,5,65,232,54,657,865,23,433);
		/*int max=0;
		for(int numero:numeros) {
			if(numero >max) {
			//if(Integer.compare(numero, max)>0) {
				max=numero;
			}
		}
		System.out.println("Max: "+max);*/
		//MAX CON EXPRESION LAMBDA
//		int max = numeros.stream().max((a,b) -> a.compareTo(b)).orElse(0);
//		System.out.println("Max: "+max);
//		//Jedi mas alto
//		Persona jediMasAlto = jedis.stream().max((a,b)->a.getCmAltura() - b.getCmAltura()).orElse(null);
//		System.out.println(jediMasAlto);
		//
		//SUMATORIO
		//
//		int sumatorio = 0;
//        for(int num: numeros) {
//            sumatorio += num;
//        }
//        System.out.println("Sumatorio:"+sumatorio);
//        System.out.println(numeros.stream().mapToInt(n->n).sum());
//        System.out.println("Alturas: "+jedis.stream().mapToInt(jedi -> jedi.getCmAltura()).sum());
		//
		//MEDIA
		//
//		int sumatorio = 0;
//        for(int num: numeros) {
//            sumatorio += num;
//        }
//        
//        int media = sumatorio / numeros.size();
		//
		//FILTRAR ELEMENTOS (SE USA MUCHO)
		//
//		numeros.stream().filter(n -> n>100).forEach(System.out::println);
//		List<Integer> numerosMayores100 = numeros.stream().filter(n -> n>100).collect(Collectors.toList());
//		System.out.println(numerosMayores100);

		//
		// MAP
		//
//		numeros.stream().map(n -> n*2).forEach(System.out::println);
//		List<Integer> dobles = numeros.stream().map(n->n*2).collect(Collectors.toList());

		//
		//REDUCE
		//
		int sumatoria = numeros.stream().reduce(0, (acumulado,valorActual) -> acumulado+valorActual);
		System.out.println(sumatoria);
		
	}

}
