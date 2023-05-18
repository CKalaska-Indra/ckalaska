package indra.talentCamp.relaciones;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import indra.talentCamp.composite.Multiplicacion;
import indra.talentCamp.composite.Operacion;
import indra.talentCamp.composite.Suma;
import indra.talentCamp.composite.Valor;

import org.mozilla.javascript.*;


public class Program {

	public static void main(String[] args) {
		// 2+2*3
		Operacion calculo = new Suma(
				new Valor(2),
				new Multiplicacion(new Valor(2), new Valor(3))
				);
		System.out.println("2+2*3"+calculo.calcular());

//		Operacion calculo3 = new Suma(5,
//	            new Suma(
//	                new Multiplicacion(3,8),
//	                new Multiplicacion(4,3)
//	            ));
		String expresion = "5+3*8+4*3";

		//Ejecutar js en java con la libreria Rhino
		Context jsContext = Context.enter();
		try {
			var resultado = jsContext.evaluateString(jsContext.initSafeStandardObjects(),
					expresion, 
					"Calculo", 
					1, 
					null);
			System.out.println("El resultado es: "+expresion+"="+ resultado);
		}finally {
			Context.exit();
		}
		
	}

}
