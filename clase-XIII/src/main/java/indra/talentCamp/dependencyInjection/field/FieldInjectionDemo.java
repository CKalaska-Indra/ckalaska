package indra.talentCamp.dependencyInjection.field;

public class FieldInjectionDemo {


	public static void aTodoGas() {
		//Tiempo de configuración
		PartyService service = new PartyService();
		service.setRepository(new DatabaseRepository());
		
		//Tiempo de ejecución
		service.haveFun();
	}


}
