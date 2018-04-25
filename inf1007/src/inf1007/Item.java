package inf1007;

public class Item {
	
	private String nom;
	private Client client;
	private Vehicule vehicule;
	
	public Item(String nom, Client client, Vehicule vehicule)
	{
		this.setNom(nom);
		this.setClient(client);
		this.vehicule = vehicule;
		
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString()
	{
		return this.nom;
		
	}

}
