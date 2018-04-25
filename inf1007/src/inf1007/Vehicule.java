package inf1007;

import java.util.ArrayList;

public class Vehicule {
	
	private String IDVehicule;
	private String Nom;
	private String  Type;
	private String Marque;
	private String Moteur;
	private int Kilometrage;
	private ArrayList<NoteDeService> Notes;
	
	
	public Vehicule(String IDVehicule, String Nom, String Type, String Marque, String Moteur, int Kilometrage) 
	{
		this.IDVehicule = IDVehicule;
		this.Nom = Nom;
		this.Type = Type;
		this.Marque = Marque;
		this.Moteur = Moteur;
		this.Kilometrage = Kilometrage;
		this.Notes = new ArrayList<NoteDeService>();
	}


	public String getIDVehicule() {
		return IDVehicule;
	}


	public void setIDVehicule(String iDVehicule) {
		IDVehicule = iDVehicule;
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public String getMarque() {
		return Marque;
	}


	public void setMarque(String marque) {
		Marque = marque;
	}


	public String getMoteur() {
		return Moteur;
	}


	public void setMoteur(String moteur) {
		Moteur = moteur;
	}


	public int getKilometrage() {
		return Kilometrage;
	}


	public void setKilometrage(int kilometrage) {
		Kilometrage = kilometrage;
	}


	public ArrayList<NoteDeService> getNotes() {
		return Notes;
	}


	public void setNotes(ArrayList<NoteDeService> notes) {
		Notes = notes;
	}
	
	public String toString()	
	{
		return this.Nom;
	}

}
