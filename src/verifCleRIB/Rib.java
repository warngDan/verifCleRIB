package verifCleRIB;

public class Rib {
	
	private String numRib;
	
	
	
	public Rib() {
	}

	public Rib(String numRib) {
		this.numRib = numRib;
	}

	public String getNumRib() {
		return numRib;
	}

	public void setNumRib(String numRib) {
		this.numRib = numRib;
	}

	@Override
	public String toString() {
		return "Rib [numRib=" + numRib + "]";
	}
	
	
}
