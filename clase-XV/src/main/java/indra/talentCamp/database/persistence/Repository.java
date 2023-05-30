package indra.talentCamp.database.persistence;

import java.util.List;

public interface Repository<T>{

	//MODIFICACIONES
	public void save(T nuevo) throws SaveErrorException;
	public void update(T existente) throws UpdateErrorException;
	public void delete(int id) throws NotFoundException;
	
	//BUSQUEDAS
	List<T> findAll();
	public T findById (int id) throws NotFoundException;
}
