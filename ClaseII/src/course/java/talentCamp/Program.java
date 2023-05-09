package course.java.talentCamp;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void cambiarValor(int n) {
		n = 20;
	}
	
	public static void cambiarRectangulo(Rectangulo rec) {
		rec.base=12;
	}
	
	public static void main(String[] args) {
		System.out.println("Hola buenos dias");
		
		
		Rectangulo r = new Rectangulo();
		
		int a = 555;
		cambiarValor(a);
		System.out.println(a);
		
		r.base=888;
		cambiarRectangulo(r);
		System.out.println(r.base);
		
		//ctrl+shift+O para hacer imports automaticos
		List<String> nombres = new ArrayList<String>();
		nombres.add("Carlos");
		nombres.add("Fino");
		nombres.add("Paco");
		nombres.add("FFifu");
		nombres.add("Carls");
		
		String nombreActual=null;
		for (int i = 0; i<nombres.size(); i++) {
			nombreActual=nombres.get(i);
			System.out.println(nombreActual);
		}

		
		
	}
}
