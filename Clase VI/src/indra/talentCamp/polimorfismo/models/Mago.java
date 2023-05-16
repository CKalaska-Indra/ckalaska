package indra.talentCamp.polimorfismo.models;

public class Mago extends Jugador{
	
	private int poderMagico;
	private int mana;

	public Mago(String nombre) {
		super(nombre);
		this.poderMagico = 10;
		this.mana = 100;
		// TODO Auto-generated constructor stub
	}
	
	public void accion(Jugador enemigo) {
		System.out.format("%s tira un hechizo a %s y modifica sus stats", 
				this.getNombre(), 
				enemigo.getNombre());
		System.out.println();

		if ( mana > poderMagico) {
			enemigo.setModFuerza(-this.poderMagico);
			this.mana -= poderMagico;
		}
	}
	@Override
	public void finalizarTurno(){
		//Se restablece los stats
		super.finalizarTurno();
		this.mana =+ 1;
	}

}
