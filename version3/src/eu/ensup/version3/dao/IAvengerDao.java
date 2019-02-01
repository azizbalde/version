package eu.ensup.version3.dao;

import java.sql.SQLException;
import java.util.List;

import eu.ensup.version3.domaine.Avenger;
import eu.ensup.version3.exception.DaoException;

public interface IAvengerDao {
	
	public void createAvenger(Avenger avenger) throws DaoException;  // Create
	public Avenger readAvengerbyname(Avenger avenger); // read
	public String updateAvengerbyname(Avenger avenger, String newpower); // update
	public void deleteAvengerbyname(Avenger avenger); // delete
	public List<Avenger> getAll();
	
}
