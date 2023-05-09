import java.util.*;

import indra.utils.Consola;

public class Azar {

		public static void main(String[] args) {
			Random r = new Random();
			int azar = r.nextInt(1,100);
			for(int i = 0; i<7; i++){
				int numero = Consola.readInt("Introduce un numero");
				if(azar==numero) {
					System.out.println("El numero es correcto");
					break;
				}
				else {
					if(azar<numero) System.out.println(numero+" es mayor");
					else System.out.println(numero+" es menor");
				}
				
			}
			System.out.println("Se te acabaron los intentos");
		}
}
