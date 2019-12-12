package verifCleRIB;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
	
	private static final String[][] listIbanTest = {{"30001", "00794", "12345678901", "85"},
													{"30004", "00003", "12345678901", "43"},
													{"30006", "00001", "12345678901", "89"},
													{"10107", "00101", "12345678901", "29"},
													{"11315", "00001", "12345678901", "38"},
													{"30002", "03253", "12345678901", "68"},
													{"30056", "00927", "12345678901", "82"},
													{"11808", "00910", "12345678901", "47"},
													{"10011", "00020", "12345678901", "88"},
													{"30076", "02082", "12345678901", "86"},
													{"14410", "00001", "12345678901", "63"},
													{"12548", "02998", "12345678901", "61"},
													{"30007", "00011", "12345678901", "44"},
													{"42559", "00001", "12345678901", "21"},
													{"30087", "46642", "12345678901", "80"}, // false
													{"30087", "46642", "12345678901", "07"},	
												};

	public static void main(String[] args) {
		
		BankUtil bankutil 	= new BankUtil();
		Etablissement bank 	= new Etablissement();
		Guichet guichet 	= new Guichet();
		Compte compte 		= new Compte();
		Rib rib 			= new Rib();
		
		String numCompte = "";
		
		for (String[] iban : listIbanTest) {
			bank.setNumEtablissement(iban[0]);
			guichet.setNumGuichet(iban[1]);
			compte.setNumero(iban[2]);
			rib.setNumRib(iban[3]);
			
			numCompte = iban[0]+iban[1]+iban[2]+iban[3];
			
			System.out.println("Numéro de compte : "+numCompte+" validité : "+ bankutil.modulo(new BigInteger(numCompte)));
		}
	}

}
