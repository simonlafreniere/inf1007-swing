package inf1007;

public class Paiement {
	
	protected float montant;
	protected static int id=0;
	
	public Paiement(float montant)
	{
		this.montant=montant;
		id++;
	}
	
	public float getMontant()
	{
		return montant;
	}

}
