import static org.junit.Assert.assertEquals;

import java.util.Properties;

import org.junit.*;

import com.google.gson.Gson;

import indra.talentCamp.maven.models.Persona;

public class GsonTests {
	String json = "{\"nombre\":\"pepe\",\"edad\":23}";
	
	Gson gson = new Gson();
	@Test
	public void shouldReadPropertiesFromJson() {
		Properties p = gson.fromJson(json, Properties.class);
		assertEquals("pepe", p.getProperty("nombre"));
		assertEquals("23", p.getProperty("edad"));

	}
	
	@Test
	public void shouldReadCustomObjectFromJson() {
		Persona persona = gson.fromJson(json, Persona.class);
		assertEquals("pepe", persona.getNombre());
		assertEquals(23, persona.getEdad());
	}
}
