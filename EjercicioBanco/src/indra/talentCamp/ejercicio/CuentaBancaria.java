package indra.talentCamp.ejercicio;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {

	protected int numCuenta;
	protected double saldo;
	private List<Movimiento> movimientos = new ArrayList<>();
	private Cliente cliente;
	
	public CuentaBancaria(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public abstract void depositar(double dinero);
	public abstract void extraer(double dinero);
	
}
