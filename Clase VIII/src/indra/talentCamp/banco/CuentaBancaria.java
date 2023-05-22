package indra.talentCamp.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public abstract class CuentaBancaria {
	
	private static int ULTIMO_NUMERO = 1;
	private int numCuenta; 
	

	protected List<Movimiento> movimientos = new ArrayList<Movimiento>();  //Conviene usar un arrayList
	private Cliente propietario;
	
	//Si no se pone nada es private, pero un private especial que se llama package-private
	CuentaBancaria(Cliente propietario) {
		super();
		this.propietario = propietario;
		this.numCuenta = CuentaBancaria.ULTIMO_NUMERO;
		CuentaBancaria.ULTIMO_NUMERO++;
	}
	
	public int getNumCuenta() {
		return numCuenta;
	}
	
	public double getSaldo() { //Hace una una suma de todos los movimientos
		return movimientos.stream().mapToDouble(movimiento->movimiento.getSaldo()).sum();

	}
	
	public List<Movimiento> getMovimientos() {
		return Collections.unmodifiableList(movimientos);
	}

	public Cliente getPropietario() {
		return propietario;
	}

	public void depositar(double saldo) {
        movimientos.add(new Movimiento(saldo));
	}
	
	public void depositar(double saldo, String motivo) {
        movimientos.add(new Movimiento(saldo, motivo));
	}

	public abstract void extraer(double saldo) throws SaldoInsuficienteException;
	public abstract void extraer(double saldo, String motivo) throws SaldoInsuficienteException;

	
}
