package indra.talentCamp.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import indra.talentCamp.banco.Banco;
import indra.talentCamp.banco.Cliente;
import indra.talentCamp.banco.CuentaBancaria;
import indra.talentCamp.banco.SaldoInsuficienteException;

class CuentaBancariaTests {

	Cliente demoCliente;
	
	@BeforeEach
	public void before() {
		System.out.println("Antes de ejecutar los test de esta clase");
		demoCliente = Cliente.builder()
				.setId(1)
				.setNombre("Carlos")
				.setApellido("Kalaska")
				.build();
	}
	
	@Test
	void ShouldAutoIncrementCuentaBancariaNum() {
		
		Banco banco = new Banco();

		CuentaBancaria cuentaUno = banco.crearCuentaCorriente(demoCliente);
		CuentaBancaria cuentaDos = banco.crearCajaAhorro(demoCliente);
	
		assertTrue(cuentaUno.getNumeroCuenta()< cuentaDos.getNumeroCuenta(),"Las dos cuentas no son correctas ");
		assertEquals(1, cuentaUno.getNumeroCuenta());
		assertEquals(2, cuentaDos.getNumeroCuenta());
	}

	@Test
	void ShouldNotBeAbleToExtractMoreFromCajaAhorro() {
		Banco banco = new Banco();

		CuentaBancaria cajaAhorro = banco.crearCajaAhorro(demoCliente);
		cajaAhorro.depositar(100);
		
		assertTrue(cajaAhorro.getSaldo()>0,"No se ha depositado correctamente");
		assertThrows(SaldoInsuficienteException.class, () -> cajaAhorro.extraer(200));
	}
	
	@Test
	void ShouldExtractCorrectly() throws SaldoInsuficienteException{
		Banco banco = new Banco();

		Cliente demoCliente = Cliente.builder()
				.setId(1)
				.setNombre("Carlos")
				.setApellido("Kalaska")
				.build();
		CuentaBancaria cajaAhorro = banco.crearCajaAhorro(demoCliente);

		cajaAhorro.depositar(100);
		cajaAhorro.extraer(50);
		
		assertEquals(50, cajaAhorro.getSaldo());
	}
}
