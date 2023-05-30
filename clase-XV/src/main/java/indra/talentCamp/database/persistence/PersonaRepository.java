package indra.talentCamp.database.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import indra.talentCamp.database.models.Persona;
import lombok.Getter;
import lombok.Setter;

public class PersonaRepository implements Repository<Persona> {

	@Getter @Setter
	private String connectionString;
	
	@Override
	public void save(Persona nuevo) throws SaveErrorException {
		// TODO Auto-generated method stub
		throw new Error("Not implemented yet");
	}

	@Override
	public void update(Persona existente) throws UpdateErrorException {
		// TODO Auto-generated method stub
		throw new Error("Not implemented yet");

	}

	@Override
	public void delete(int id) throws NotFoundException {
		// TODO Auto-generated method stub
		throw new Error("Not implemented yet");

	}

	@Override
	public List<Persona> findAll() {
		Connection conn = null;
        List<Persona> p = new ArrayList<Persona>();
        
        try {
            try {
                //conn = DriverManager.getConnection("jdbc:sqlite:indra.db");
            	conn = DriverManager.getConnection(this.connectionString);                              
                Statement select = conn.createStatement();
                ResultSet resultSet = select.executeQuery("SELECT * FROM Persona");
                while(resultSet.next()) {
                    
                    Persona pe = new Persona();
                    pe.setId(resultSet.getInt("id"));
                    pe.setNombre(resultSet.getString("nombre"));
                    pe.setEdad(resultSet.getInt("edad"));
                    
                    p.add(pe);
                }
                
            } finally {
                if (conn != null) {
                    conn.close();
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        
        return p;


		//return null;
	}

	@Override
	public Persona findById(int id) throws NotFoundException {
		throw new Error("Not implemented yet");
		//return null;
	}

	
	
}
