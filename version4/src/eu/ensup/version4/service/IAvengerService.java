package eu.ensup.version4.service;

import java.util.List;

import eu.ensup.version4.domaine.Avenger;
import eu.ensup.version4.exception.ServiceException;

public interface IAvengerService {
	
	public void ajouterAvenger(Avenger avenger) throws Exception;
	public Avenger recupererAvenger(Avenger avenger);
	public void modifierAvenger(Avenger avenger, String pouvoir);
	public void supprimerAvenger(Avenger avenger);
	public List<Avenger> recupererTout();
	public void ComparerAvenger(Avenger avenger1, Avenger avenger2)throws ServiceException;
	
}
