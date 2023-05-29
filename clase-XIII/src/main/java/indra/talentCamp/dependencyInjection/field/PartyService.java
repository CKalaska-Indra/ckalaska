package indra.talentCamp.dependencyInjection.field;

public class PartyService {

	private Repository repository;
	
	public void setRepository(Repository repository) {
		this.repository = repository;
	}
	public void haveFun() {
		assert this.repository != null;
		//...
		System.out.println("Everybody have fun tonight");
		this.repository.Save();
	}
}
