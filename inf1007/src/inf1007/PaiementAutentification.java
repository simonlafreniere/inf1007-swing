package inf1007;

import java.util.Date;
import java.util.Random;

public class PaiementAutentification {

	
	public static int autentification(CarteCredit carte){
		
		Date today = new Date();
		if(carte.getDateExpiration().after(today))
			return 1;
		
		Random rnd=new Random();
		int num=rnd.nextInt(10);
		
		
		return 0;
	}
}
