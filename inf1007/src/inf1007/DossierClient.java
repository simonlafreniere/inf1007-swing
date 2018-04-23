package inf1007;

import java.util.ArrayList;

public class DossierClient {
	
	private ArrayList<Client> ListeClient;
	
	
	public DossierClient() 
	{
		this.ListeClient = new ArrayList<Client>();
	}
	

	public boolean ajouterClient(Client Client)
	{
		
		if(ListeClient.add(Client))
			return true;
		else
		return false;
	}
	
	public boolean getClient(Client Client)
	{
		//TODO search client by....
		return false;
	}
	
	public boolean modifierClient(Client Client)
	{
		return false;	
	}
	
	public boolean supprimerClient(Client Client)
	{
		if(ListeClient.remove(Client))
			return true;
		else
		return false;
	}
}
