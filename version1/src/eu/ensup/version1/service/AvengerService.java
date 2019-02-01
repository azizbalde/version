package eu.ensup.version1.service;

import java.util.ArrayList;
import java.util.List;




import eu.ensup.version1.dao.AvengerDao;
import eu.ensup.version1.domaine.Avenger;

public class AvengerService{
	
	AvengerDao ad = new AvengerDao(); 
	
	public void ajouterAvenger(Avenger avenger) throws Exception {
		ad.createAvenger(avenger);
	}
	public Avenger recupererAvenger(Avenger avenger) {
		System.out.println(ad.readAvengerbyname(avenger));
		return ad.readAvengerbyname(avenger);
	}
	public void modifierAvenger(Avenger avenger, String pouvoir) {
		
		ad.updateAvengerbyname(avenger, pouvoir);
		
	}
	public void supprimerAvenger(Avenger avenger) {
		
		ad.deleteAvengerbyname(avenger);
	}
	
	public List<Avenger> recupererTout() {
		
		System.out.println(ad.getAll());
		return ad.getAll();
	}
	
	
	
	
	
	
	



	List<Avenger> maListeAvengers = new ArrayList<Avenger>();


	public void ajouterListeAvengers(Avenger av) {

		maListeAvengers.add(av);
	}

	// 3- Modification
	public Avenger modifierListeAvengers(int index, Avenger av) {

		Avenger a = maListeAvengers.set(index, av);

		return a;

	}

	// 4- Suppression
	public void supprimerListeAvengers() {
		maListeAvengers.clear();
	}
	

}
