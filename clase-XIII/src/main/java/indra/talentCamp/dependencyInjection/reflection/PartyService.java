package indra.talentCamp.dependencyInjection.reflection;

public class PartyService {

	private static Class<? extends Repository> repositoryClass = null;

	//Esta forma sirve solamente para las clases que tienen constructores sin parametros

	public static void registerRepositoryClass(Class<? extends Repository> repositoryClass) {
		PartyService.repositoryClass = repositoryClass;
	}
	
	private Repository repository;

	public PartyService() {
		if (PartyService.repositoryClass==null) {
			throw new Error("Te olvidaste de configurar el party service");
		}
		try {
			this.repository = PartyService.repositoryClass.getConstructor().newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Error("El constructor es privado");
		}
		
	}
	
	public void haveFun() {
		System.out.println("Everybody have fun tonight");
		this.repository.Save();
	}
}
