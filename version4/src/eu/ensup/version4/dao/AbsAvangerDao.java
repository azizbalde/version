package eu.ensup.version4.dao;

import java.util.List;

import eu.ensup.version4.domaine.Avenger;
import eu.ensup.version4.exception.DaoException;

public abstract class AbsAvangerDao {
	
	public AccesBd bd = new AccesBd();
	
	public abstract void createAvenger(Avenger avenger) throws DaoException;  // Create
	public abstract Avenger readAvengerbyname(Avenger avenger); // read
	public abstract String updateAvengerbyname(Avenger avenger, String newpower); // update
	public abstract void deleteAvengerbyname(Avenger avenger); // delete
	public abstract List<Avenger> getAll();

}
