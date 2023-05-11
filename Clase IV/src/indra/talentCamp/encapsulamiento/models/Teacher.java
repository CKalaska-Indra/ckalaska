package indra.talentCamp.encapsulamiento.models;

public class Teacher extends Person{
	/*
	private String name;
	private int document;
	private String address;*/
	private String preferedLanguage;
	
	
	public Teacher(String name, int document, String address) {
		super(name, document, address);
		this.preferedLanguage="Java";
	}


	public Teacher(String name, int document, String address, String preferedLanguage) {
		super(name, document, address);
		this.preferedLanguage = preferedLanguage;
	}
	

	@Override
	public String toString() {
		return getName() + " (Documento: "+ getDocument() + ")\n ["+getAddress()+"]\n";
	}
	
}
