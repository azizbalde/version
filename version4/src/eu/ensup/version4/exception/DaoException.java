package eu.ensup.version4.exception;

public class DaoException extends Exception {
	
	//public SQLException except = new SQLException();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DaoException() {
		System.out.println("Problème venant du DAO : \nVerifier l'écriture des champs");
	}
	

}
