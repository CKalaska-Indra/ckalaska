package indra.talentCamp.interfaces;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Program {

	//List<Area> dibujo = Arrays.asList(
	//	new Circulo(10.0),
	//	new Triangulo(12,15,16.36,16.36),
	//	new Rectangulo(10,10)));		
	//System.out.println("Areas: "+dibujo.stream().mapToDouble(figura -> figura.calcularArea()).sum());
	//
	//System.out.println("Perimetros: "+dibujo.stream().mapToDouble(figura -> figura.calcularPerimetro()).sum());

	public static void main(String[] args) {
		List<Area> escenario = Arrays.asList(
				new Circulo(10.0),
				new Triangulo(12,15,16.36,16.36),
				new Rectangulo(10,10),
				new Planta());
		
		double perimetroTotal = 0.0;
		//CASTEOS
		for(Area c: escenario) {
			if (c instanceof Perimetro) { //Casteo clásico
				perimetroTotal += ((Perimetro)c).calcularPerimetro();
			}
//			if (Perimetro.class.isInstance(c)) {	//Otro tipo de casteo
//				perimetroTotal += Perimetro.class.cast(c).calcularPerimetro();
//			}
		}
		//Casteo con expresion lambda
		
		perimetroTotal = escenario.stream()
				//.filter(Perimetro.class::isInstance) descarta los que no son instancia de perimetro
				.map(Perimetro.class::cast).mapToDouble(p -> p.calcularPerimetro()).sum();
		
		System.out.println("Perimetro Total:"+perimetroTotal);
		
		List<Figura> figuras = escenario.stream()
				.filter(Figura.class::isInstance)
				.map(Figura.class::cast).collect(Collectors.toList());
		System.out.println(figuras.getClass());
		Collections.sort(figuras);
		escenario.stream().forEach(System.out::println);
	}

}
