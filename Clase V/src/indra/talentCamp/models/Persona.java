package indra.talentCamp.models;

public class Persona {
	private String nombre;
	private int cmAltura;
	
		
	public Persona(String nombre, int cmAltura) {
		super();
		this.nombre = nombre;
		this.setCmAltura(cmAltura);
	}
	public int getCmAltura() {
		return cmAltura;
	}
	public void setCmAltura(int cmAltura) {
		if(cmAltura>300) throw new Error("No se puede medir más de 300cm");
		if(cmAltura<0) throw new Error("No se puede medir menos de 0cm");
//		assert(cmAltura>300);
//		assert(cmAltura<0);		//Otra alternativa
		this.cmAltura=cmAltura;   
	}
	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", cmAltura=" + cmAltura + "]";
	}
	
	
	
}
