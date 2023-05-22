package indra.talentCamp.banco;

import java.time.LocalDate;

public class Movimiento{

	private double saldo;
	private LocalDate fecha;
	private String motivo;
	
	
	public Movimiento(double saldo) {
		super();
		this.saldo = saldo;
		this.fecha = LocalDate.now();
		this.motivo = (saldo > 0)? "Deposito" : "Extracción";
	}
	
	public Movimiento(double saldo, String motivo) {
		super();
		this.saldo = saldo;
		this.fecha = LocalDate.now();
		this.motivo = motivo;
	}
	
	

//	public void depositar(CuentaBancaria cuenta, double saldo) {
//		cuenta.saldo = cuenta.saldo + saldo;
//	}
//	public void extraer(CuentaBancaria cuenta, double dinero) {
//		cuenta.saldo = cuenta.saldo - saldo;
//	}

	public String getMotivo() {
		return motivo;
	}

	public double getSaldo() {
		return saldo;
	}

	public TipoMovimiento getTipo() {
		if (this.saldo>0) {
			return TipoMovimiento.Deposito;
		}
		return TipoMovimiento.Extraccion;
	}
	@Override
	public String toString() {
		return "Movimiento";
	}

	
}
