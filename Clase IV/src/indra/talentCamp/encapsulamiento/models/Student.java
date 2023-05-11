package indra.talentCamp.encapsulamiento.models;

public class Student extends Person{
	/*
	private String name;
	private int document;
	private String address;*/
	private boolean prefersFrontend;
	
	
	public Student(String name, int document, String address, boolean prefersFrontend) {
		super(name, document, address);
		this.prefersFrontend = prefersFrontend;
	}


	public Student(String name, int document, String address) {
		super(name, document, address);
		this.prefersFrontend = false;
	}

	public boolean getPrefersFrontend() {
		return prefersFrontend;
	}
	public void setPrefersFrontend(boolean prefersFrontend) {
		this.prefersFrontend = prefersFrontend;
	}


	@Override
	public String toString() {
		return getName() + " (Documento: "+ getDocument() + ")\n ["+getAddress()+"]\n"+(this.prefersFrontend ? "Entusiasta de Frontend" : "Fanático de backend");
	}
	
	
}
