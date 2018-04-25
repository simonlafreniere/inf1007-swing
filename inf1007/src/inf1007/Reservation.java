package inf1007;

import java.util.Date;

public class Reservation {
	
	private Client Client;
	private Vehicule Vehicule;
	private Date dateReservation;
	private Date dateRetour;
	private Statut Statut;
	private float prix;
	
	public Reservation(Client Client, Vehicule Vehicule)
	{
		this.Client = Client;
		this.Vehicule = Vehicule;

	}
	
	public Reservation(Client Client, Vehicule Vehicule, Date dateReservation, Date dateRetour, Statut Statut)
	{
		this.Client = Client;
		this.Vehicule = Vehicule;
		this.dateReservation = dateReservation;
		this.dateRetour = dateRetour;
		this.Statut = Statut;
	}

	public Client getClient() {
		return Client;
	}

	public void setClient(Client client) {
		Client = client;
	}

	public Vehicule getVehicule() {
		return Vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		Vehicule = vehicule;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public Statut getStatut() {
		return Statut;
	}

	public void setStatut(Statut statut) {
		Statut = statut;
	}
	
	public void setPrix(float montant)
	{
		prix=montant;
	}

	public float getPrix()
	{
		return prix;
	}
}
