package eu.ensup.version4.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesBd {

	public Connection cn;
	public Statement st;

	// TODO Connexion à la BD

	public Connection seConnecter() {
		
		//

		//System.out.println("Connexion en cours...");

		String url = "jdbc:mysql://localhost/avengers?verifyServerCertificate=false&useSSL=true";
		String login = "root";
		String passwd = "";

		try {
			// Etape 1 : Chargement du driver
						try {
							Class.forName("com.mysql.jdbc.Driver");
						} catch (Exception e) {
							System.out.println("votre driver ??????");
						}

						// Etape 2 : récupération de la connexion
						try {
							cn = DriverManager.getConnection(url, login, passwd);
							st = cn.createStatement();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
							System.out.println("erreur url+/login+/mdp");
						}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return cn;
	}

	// TODO Déconnexion à la BD

	public void seDeconnecter() {
		try {
			cn.close();
			st.close();
			//System.out.println("Déconnecté. \nBye ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
