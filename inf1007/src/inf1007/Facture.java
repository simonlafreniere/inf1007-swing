package inf1007;

import java.util.*;  

public class Facture {
	private ArrayList<Paiement> paiements;
	private ArrayList<Reservation> reservations;
	private Client client;
	private float total;
	
	public Facture(Client client)
	{
		total = 0;
		this.client=client;
		paiements=new ArrayList<Paiement>();
		reservations=new ArrayList<Reservation>();
	}
	
	public void addPaiement(int montant)
	{
		Paiement nouveauPaiement = new Paiement(montant);
		paiements.add(nouveauPaiement);
		setTotal();
	}
	
	public void setTotal(){
		for(Reservation res:reservations)
		{
			total+=res.getPrix();
		}
		for(Paiement pa:paiements)
		{
			total-=pa.getMontant();
		}
	}
	
	public float getTotal()
	{
		return total;
	}

}
