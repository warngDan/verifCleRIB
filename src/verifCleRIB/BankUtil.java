package verifCleRIB;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BankUtil {
	
	
	private Map<Integer, Character[]> hashmap = new HashMap<Integer, Character[]>();
	
	
	
	public BankUtil() {
		initMap();
	}

	public Integer char2int(Character c) {
		Integer key = 0;
		if (c != null) {
			c = Character.toUpperCase(c);
			
			for (HashMap.Entry<Integer, Character[]> entry : hashmap.entrySet()) {
				for (Character d : entry.getValue()) {
					if (d.equals(c)) {
						key = entry.getKey();
						break;
					}
				}
			}
    		return key;
		}
		return null;
	}
	
	public boolean modulo(BigInteger num) {
		
		BigInteger diviseur = BigInteger.valueOf(97L);
		BigInteger[] result = num.divideAndRemainder(diviseur);
		
		return (result[1] == BigInteger.valueOf(0)); 

	}
	
	public Map<Integer, Character[]> getHashmap() {
		return hashmap;
	}

	public final void initMap() {
		hashmap.put(1, new Character[] {'A', 'J'});
		hashmap.put(2, new Character[] {'B', 'K', 'S'});
		hashmap.put(3, new Character[] {'C', 'L', 'T'});
		hashmap.put(4, new Character[] {'D', 'M', 'U'});
		hashmap.put(5, new Character[] {'E', 'N', 'V'});
		hashmap.put(6, new Character[] {'F', 'O', 'W'});
		hashmap.put(7, new Character[] {'G', 'P', 'X'});
		hashmap.put(8, new Character[] {'H', 'Q', 'Y'});
		hashmap.put(9, new Character[] {'I', 'R', 'Z'});
	}
}
