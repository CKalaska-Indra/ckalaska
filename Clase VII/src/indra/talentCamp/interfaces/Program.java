package indra.talentCamp.interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import indra.talentCamp.generics.CajaFuerte;
import indra.talentCamp.generics.Operacion;



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
		
		OperacionInteger sumaInt = (a,b) -> (a+b);
		int resInt = sumaInt.operar(2, 2);
		System.out.println("Suma es:"+resInt);

		Operacion<Integer> suma = (a,b)->(a+b);
		int res = suma.operar(2,2);
		System.out.println("Suma es:"+res);
		
		CajaFuerte<String, String> claveTexto = new CajaFuerte<>("Abrete sesamo");
		claveTexto.guardarValor("La clave del banco");
		claveTexto.leerValor("Abrete sesamo");
		
		
		CajaFuerte<Integer, String> claveInt = new CajaFuerte<>("Abrete Sesamo");
		claveInt.guardarValor(69420);
        Integer claveOk = claveInt.leerValor("Abrete Sesamo");
        System.out.println("La clave es: " + claveOk);
        System.out.println("Intentando acceder con una clave invalida");
        try{
            claveInt.leerValor("asdas");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
		
		
		
	}

}
