package indra.talentCamp.polimorfismo.models;

public abstract class Jugador {
	private String nombre;
	private int hp;
	private int fuerza;
	private int modFuerza;
	private int destreza;
	
//	private int tipoJugador = 1; //1-Guerrero, 2-Sacerdote, 3-Mago
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.hp = 50;
		this.fuerza = 50;
		this.destreza = 50;
	}

	public boolean estaVivo() {
		return (this.hp>0);
	}
	
	
	public int getHp() {
		return hp;
	}

	protected void setHp(int hp) {
		this.hp = hp;
	}

	public int getFuerza() {
		return fuerza;
	}

	protected void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getDestreza() {
		return destreza;
	}

	protected void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setModFuerza(int modFuerza) {
		this.modFuerza = modFuerza;
	}
	
	public abstract void accion(Jugador enemigo);

	@Override
	public String toString() {
		return this.getClass().getSimpleName() +" "+ nombre + ", hp=" + hp + ", fuerza=" + fuerza + ", destreza=" + destreza;
	}
	
	public void finalizarTurno(){
		//Se restablecen los stats
		this.modFuerza = 0;
	}




	
	
}
