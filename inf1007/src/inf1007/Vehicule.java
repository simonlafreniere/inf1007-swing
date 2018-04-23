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
	
	
	public Vehicule() 
	{
		
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

}
