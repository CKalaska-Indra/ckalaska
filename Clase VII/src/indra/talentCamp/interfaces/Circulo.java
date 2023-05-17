package indra.talentCamp.interfaces;

public class Circulo extends Figura{

	private double radio;
	
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.radio, 2);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return Math.PI * 2 * this.radio;
	}

	public double getRadio() {
		return radio;
	}



}
