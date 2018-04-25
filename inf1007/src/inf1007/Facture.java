package inf1007;

import java.util.*;  

public class Facture {
	private ArrayList<Paiement> paiements;
	private ArrayList<Reservation> reservations;
	private Client client;
	
	public Facture(Client client)
	{
		this.client=client;
		paiements=new ArrayList<Paiement>();
		reservations=new ArrayList<Reservation>();
	}

}
