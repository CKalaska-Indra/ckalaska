package indra.talentCamp.ejercicio;

import java.time.LocalDate;

public abstract class Movimiento extends CuentaBancaria{

	public double saldo;
	private LocalDate fecha;
	
	
	public Movimiento(double saldo) {
		super(cliente);
		this.saldo = saldo;
		this.fecha = LocalDate.now();
	}

	public void depositar(CuentaBancaria cuenta, double saldo) {
		cuenta.saldo = cuenta.saldo + saldo;
	}
	public void extraer(CuentaBancaria cuenta, double dinero) {
		cuenta.saldo = cuenta.saldo - saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	
}
