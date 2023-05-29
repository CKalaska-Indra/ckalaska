package indra.talentCamp.dependencyInjection.field;

public class DatabaseRepository implements Repository{

	public void Save() {
		System.out.println("Hago un INSERT INTO y grabo en la base de datos");
	}

	
}
