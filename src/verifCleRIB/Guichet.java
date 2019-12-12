package verifCleRIB;

public class Guichet {
	
	
	private String numGuichet;
	
	
	

	public Guichet() {}

	public Guichet(String numGuichet) {
		this.numGuichet = numGuichet;
	}

	public String getNumGuichet() {
		return numGuichet;
	}

	public void setNumGuichet(String numGuichet) {
		this.numGuichet = numGuichet;
	}

	@Override
	public String toString() {
		return "Guichet [numGuichet=" + numGuichet + "]";
	}
	

}
