package inf1007;

public class PaiementCredit extends Paiement{

	private CarteCredit carte;
	
	public PaiementCredit(int montant,CarteCredit carte) {
		super(montant);
		this.carte=carte;
	}

}
