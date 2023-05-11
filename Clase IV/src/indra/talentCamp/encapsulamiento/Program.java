package indra.talentCamp.encapsulamiento;



import indra.talentCamp.encapsulamiento.models.*;
import indra.talentCamp.utils.Consola;

public class Program {

	public static void main(String[] args) {

		System.out.println("¿Quién va a dar el curso?");
		Teacher jedi = new Teacher(
				Consola.readString("¿Cuál es tu nombre?"),
				Consola.readInt("¿Cúal es su documento?"),
				Consola.readString("¿Cuál es su dirección?")
		);
		System.out.println("¿Quién va a asistir el curso?");
		Student padawan = new Student(
				Consola.readString("¿Cuál es tu nombre?"),
				Consola.readInt("¿Cúal es su documento?"),
				Consola.readString("¿Cuál es su dirección?")
				//Consola.readString("¿Te gusta el frontend? (S/N)",
		);
		System.out.println("Bienvenidos al Talent Camp");
		
		/*
		padawan.setName(Consola.readString("¿Cuál es tu nombre?"));
		padawan.setDocument(Consola.readInt("¿Cúal es su documento?"));
		padawan.setAddress(Consola.readString("¿Cuál es su dirección?"));
		String respuesta = Consola.readString("¿Te gusta el frontend? (S/N)");
		padawan.setPrefersFrontend(respuesta.equalsIgnoreCase("S"));
		*/
		
		System.out.println("El profeso es: "+jedi);
		System.out.println("Asisten al cuso: "+padawan);
		
		/*
		System.out.println("Bienvenido "+padawan.getName()+" al Talent Camp");
		System.out.println("Su documento es "+padawan.getDocument()+" su dirección es "+padawan.getAddress());
		if(padawan.getPrefersFrontend()) {
			System.out.println("Esperemos que se le asigne un proyecto de front");
		}
		else System.out.println("Esperemos que se le asigne un proyecto de backend"); 
		*/


	}

}
