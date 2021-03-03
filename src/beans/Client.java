package beans;

public class Client {
	String NumCompte;
	String Nom;
	int Solde;
	String Login;
	String Password;
	
	public Client(String numCompte, String nom, int solde, String login, String password) {
		super();
		NumCompte = numCompte;
		Nom = nom;
		Solde = solde;
		Login = login;
		Password = password;
	}
	
	public Client(String login, String password) {
		// TODO Auto-generated constructor stub
		login = Login;
		password = Password;
	}
	
	
	
	public Client(int solde) {
		Solde = solde;
	}

	public String getNumCompte() {
		return NumCompte;
	}
	public void setNumCompte(String numCompte) {
		NumCompte = numCompte;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getSolde() {
		return Solde;
	}
	public void setSolde(int solde) {
		Solde = solde;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public boolean Authentification(String login, String password) {
		if (login.equals("1@1.com") && password.equals("123")) {
			return true;
		}else {
			return false;
		}	
	}
	
	
	
	
	

}
