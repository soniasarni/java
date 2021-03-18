package POO;

public class Ville {
	private String nom="PARIS";
	private int departement=75001;
	
	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ville(String nom, int departement) {
		super();
		this.nom = nom;
		this.departement = departement;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", departement=" + departement + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDepartement() {
		return departement;
	}

	public void setDepartement(int departement) {
		this.departement = departement;
	}
	
	

}
