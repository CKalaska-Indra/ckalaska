package indra.talentCamp.banco;

public class Cliente {

	private String nombre;
	private String apellido;
	private int id;
	
	/*
	public Cliente(int id, String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}*/
	//Ahora solo el builder puede crear un cliente
	private Cliente() {
		super();
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
	
	//Para cuando es una clase con muchos atributos
	//InnerClass
	public static class ClienteBuilder{
				
		private String nombre = null;
		private String apellido = null;
		private int id = 0;
		
		//Setters con Fluent Interfaces
		public ClienteBuilder setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}
		public ClienteBuilder setApellido(String apellido) {
			this.apellido = apellido;
			return this;
		}
		public ClienteBuilder setId(int id) {
			this.id = id;
			return this;
		}
		
		public Cliente build() {
			
			//Hay que asegurarse que el objeto cliente sea consistente
			assert this.nombre !=null;
			assert this.apellido != null;
			assert this.id != 0;	//Si no se cumple la condicion se hace un throw de AssertionError
			
			Cliente c = new Cliente();
			c.id=this.id;
			c.nombre=this.nombre;
			c.apellido=this.apellido;
			
			return c;
		}	
		
	}
	public static ClienteBuilder builder() {
		return new ClienteBuilder();
	}

	
}
