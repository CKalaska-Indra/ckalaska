package indra.talentCamp.tests;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import indra.talentCamp.banco.Cliente;
import indra.talentCamp.banco.SaldoInsuficienteException;

public class ClienteTests {

	@Test
	public void shouldValidateClienteCreation() {
		assertThrows(AssertionError.class, () -> Cliente.builder().setNombre("mal").build());
		assertThrows(AssertionError.class, () -> Cliente.builder().setApellido("mal").build());
		assertThrows(AssertionError.class, () -> Cliente.builder().setId(1).build());
		assertThrows(AssertionError.class, () -> Cliente.builder().setNombre("mal").setApellido("mal").build());

	}
}
