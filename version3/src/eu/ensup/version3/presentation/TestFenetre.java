package eu.ensup.version3.presentation;

import eu.ensup.version3.domaine.Avenger;
import eu.ensup.version3.service.AvengerService;



public class TestFenetre{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		AvengerService service = new AvengerService();
		
		
		Avenger av1 = new Avenger("kh", "vert", 22, "peut se rendre invisible");
		Avenger av2 = new Avenger("iron", "noir", 26, "peut disparaitre");
		
		service.ComparerAvenger(av1, av1) ;
		service.ajouterAvenger(av2);
//		service.afficherAvenger();
//		service.modifierAvenger(av2, "peut se déplacer dans le temps");
//		System.out.println("Afficher 1 avenger : ");
//		service.recupererAvenger(av1);
//		//service.supprimerAvenger(av1);
//		System.out.println("Afficher tous les avengers : ");
//		service.recupererTout();
		
//		service.ajouterListeAvengers(av1);
//		service.ajouterListeAvengers(av2);
//		
//		JFrame f = new JFrame("hello"); 
//		f.setSize(700, 400);
//		f.setLocationRelativeTo(null);
//		JPanel p = new JPanel();
//		
//		
//		JMenu m1 = new JMenu("Accueil");
//		JMenu m2 = new JMenu("Option");
//		JMenu m3 = new JMenu("Edition");
//		JMenuBar mb = new JMenuBar(); 
//		mb.add(m1);
//		mb.add(m2);
//		mb.add(m3);
//		f.setJMenuBar(mb);
//		
//		
//		p.add(service.afficherListeAvengers());
//		f.add(p);
//		
//		f.setVisible(true);
//		
	}

}
