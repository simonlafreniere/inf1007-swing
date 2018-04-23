package inf1007;

import java.sql.Date;

public class CarteCredit {

	private String Detenteur;
	private int NumeroCarteCredit;
	private String Fournisseur;
	private int NoSecurite;
	private Date DateExpiration;
	
	
	public CarteCredit(String Detenteur, int NumeroCarteCredit, String Fournisseur, int NoSecurite, Date DateExpiration)
	{
		this.Detenteur = Detenteur;
		this.NumeroCarteCredit = NumeroCarteCredit;
		this.Fournisseur = Fournisseur;
		this.NoSecurite = NoSecurite;
		this.DateExpiration = DateExpiration;
	}

	public String getDetenteur() {
		return Detenteur;
	}

	public void setDetenteur(String detenteur) {
		Detenteur = detenteur;
	}

	public int getNumeroCarteCredit() {
		return NumeroCarteCredit;
	}

	public void setNumeroCarteCredit(int numeroCarteCredit) {
		NumeroCarteCredit = numeroCarteCredit;
	}

	public String getFournisseur() {
		return Fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		Fournisseur = fournisseur;
	}

	public int getNoSecurite() {
		return NoSecurite;
	}

	public void setNoSecurite(int noSecurite) {
		NoSecurite = noSecurite;
	}

	public Date getDateExpiration() {
		return DateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		DateExpiration = dateExpiration;
	}
}
