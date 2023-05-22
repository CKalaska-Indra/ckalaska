package indra.talentCamp.ejercicio;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(Cliente propietario) {
		super(propietario);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void extraer(double dinero) throws SaldoInsuficienteException {
        if (this.getSaldo() < dinero) {
            throw new SaldoInsuficienteException();

        }
        this.movimientos.add(new Movimiento(-dinero));
    }
	@Override
    public void extraer(double dinero, String concepto) throws SaldoInsuficienteException {
        if (this.getSaldo() < dinero) {
            throw new SaldoInsuficienteException();

        }
        this.movimientos.add(new Movimiento(-dinero, concepto));
    }

}
