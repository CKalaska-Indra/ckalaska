package indra.talentCamp.ejercicio;

public class CuentaCorriente extends CuentaBancaria{

	public CuentaCorriente(Cliente propietario) {
		super(propietario);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void extraer(double dinero) throws SaldoInsuficienteException {
        this.movimientos.add(new Movimiento(-dinero));
    }
	
	@Override
    public void extraer(double dinero, String motivo) throws SaldoInsuficienteException {
        this.movimientos.add(new Movimiento(-dinero,motivo));
    }

}
