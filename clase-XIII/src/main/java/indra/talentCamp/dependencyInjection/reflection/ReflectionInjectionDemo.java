package indra.talentCamp.dependencyInjection.reflection;

public class ReflectionInjectionDemo {

	public static void aTodoGas() {
		//Configurar 
		PartyService.registerRepositoryClass(DatabaseRepository.class);
		
		//Ejecucion
		PartyService service = new PartyService();
		service.haveFun();
	}
}
