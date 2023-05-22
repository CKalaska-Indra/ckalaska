package indra.talentCamp.ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

	private List<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
	
	public List<CuentaBancaria> getCuentas(){
		return Collections.unmodifiableList(cuentas);
	}
	
	public CuentaBancaria crearCajaAhorro(Cliente cliente) {
		CajaAhorro cuenta = new CajaAhorro(cliente);
		this.cuentas.add(cuenta);
		return cuenta;
	}
	
	public CuentaBancaria crearCuentaCorriente(Cliente cliente) {
		CuentaCorriente cuenta = new CuentaCorriente(cliente);
		this.cuentas.add(cuenta);
		return cuenta;
	}
	
	public CuentaBancaria buscarCuenta(int numeroCuenta){
		return null
	}
}
