package inf1007;

import java.util.ArrayList;

public class CatalogueVehicule {
	
	private ArrayList<Vehicule> catalogueVehicule;
	
	public CatalogueVehicule()
	{
		setCatalogueVehicule(new ArrayList<Vehicule>());
	}
	
	public boolean ajouterVehicule(Vehicule vehicule)
	{
		
		if(catalogueVehicule.add(vehicule))
			return true;
		else
		return false;
	}

	public ArrayList<Vehicule> getCatalogueVehicule() {
		return catalogueVehicule;
	}

	public void setCatalogueVehicule(ArrayList<Vehicule> catalogueVehicule) {
		this.catalogueVehicule = catalogueVehicule;
	}

	public Vehicule getVehicule(int i)
	{
		if(!catalogueVehicule.get(i).equals(null))
		{
			return catalogueVehicule.get(i);
		}
		return null;
	}

}
