package inf1007;

public class Conducteur {

	private int IDConducteur;
	private String Nom;
	private String Prenom;
	private String Adresse;
	private String Ville;
	private String Province;
	private String CodePostal;
	private String Telephone;
	private String NoPermis;
	private String Courriel;
	private Statut Statut;
	
	public Conducteur(int IDConducteur, String Nom, String Prenom, String Adresse, String Ville, String Province,
						String CodePostal, String Telephone, String NoPermis, String Courriel) 
	{
		this.IDConducteur = IDConducteur ;
		this.Nom = Nom ;
		this.Prenom = Prenom ;
		this.Adresse = Adresse ;
		this.Ville = Ville ;
		this.Province = Province ;
		this.CodePostal = CodePostal ;
		this.Telephone = Telephone ;
		this.NoPermis = NoPermis ;
		this.Courriel = Courriel ;
	}

	public int getIDConducteur() {
		return IDConducteur;
	}

	public void setIDConducteur(int iDConducteur) {
		IDConducteur = iDConducteur;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public String getProvince() {
		return Province;
	}

	public void setProvince(String province) {
		Province = province;
	}

	public String getCodePostal() {
		return CodePostal;
	}

	public void setCodePostal(String codePostal) {
		CodePostal = codePostal;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public String getNoPermis() {
		return NoPermis;
	}

	public void setNoPermis(String noPermis) {
		NoPermis = noPermis;
	}

	public String getCourriel() {
		return Courriel;
	}

	public void setCourriel(String courriel) {
		Courriel = courriel;
	}

	public Statut getStatut() {
		return Statut;
	}

	public void setStatut(Statut statut) {
		Statut = statut;
	}

}
