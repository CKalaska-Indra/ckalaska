package indra.talentCamp.layers.models;

import java.awt.Color;

public class Jedi extends BussinessObject{

	private String nombre;
	private int nivelDeFuerza;
	private Color colorLightsaber;
	
	public Jedi(String nombre, int nivelDeFuerza, Color colorLightsaber) {
		super();
		this.nombre = nombre;
		this.nivelDeFuerza = nivelDeFuerza;
		this.colorLightsaber = colorLightsaber;
	}
	
	public Jedi(String nombre, Color colorLightsaber) {
		super();
		this.nombre = nombre;
		this.colorLightsaber = colorLightsaber;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNivelDeFuerza() {
		return nivelDeFuerza;
	}
	
	

	public void setNivelDeFuerza(int nivelDeFuerza) {
		this.nivelDeFuerza = nivelDeFuerza;
	}

	public Color getColorLightsaber() {
		return colorLightsaber;
	}

	@Override
	public String toString() {
		return "Jedi " + nombre + ", nivelDeFuerza=" + nivelDeFuerza + ", colorLightsaber=" + colorLightsaber;
	}
	
	
	
}
