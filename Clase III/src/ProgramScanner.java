import java.util.*;

import indra.utils.Consola;

import java.io.*;
public class ProgramScanner {

	public static void ejemploScanner(){
		try(Scanner in = new Scanner(System.in)){ 
			System.out.println("Introduce tu nombre...");
			String nombre = in.nextLine();
			System.out.println("Introduce tu edad...");
			int edad = in.nextInt();
			System.out.println("Hola "+nombre+" "+edad+" años");
		}//Hace solo el close
	}
	
	public static void main(String[] args) {
		//ejemploScanner();
		/*System.out.println("Ingresa un numero...");
		Scanner in = new Scanner(System.in);
		String entrada = in.nextLine();
		esNumerico(entrada);*/
		
		int num = Consola.readInt("Ingrese su edad");
		System.out.println(num);
	}

}
