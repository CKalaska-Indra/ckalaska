package indra.talentCamp.ejercicio;

public class Cliente {

	private String nombre;
	private String apellido;
	private int id;
	
	
	public Cliente(String nombre, String apellido, int id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getId() {
		return id;
	}
	
	
}
