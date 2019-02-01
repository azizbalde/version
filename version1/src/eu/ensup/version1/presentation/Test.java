package eu.ensup.version1.presentation;

import eu.ensup.version1.domaine.Avenger;
//import eu.ensup.version1.service.AvengerService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AvengerService service = new AvengerService();	
		Avenger av1 = new Avenger("kh", "vert", 22, "peut se rendre invisible");
		Avenger av2 = new Avenger("iron", "noir", 26, "peut disparaitre");
		av1.toString();
		av2.toString();
	}

}
