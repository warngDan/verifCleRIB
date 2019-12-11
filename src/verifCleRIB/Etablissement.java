package verifCleRIB;

public class Etablissement {
	
	private String numEtablissement;

	
	public Etablissement() {}

	public Etablissement(String numEtablissement) {
		this.numEtablissement = numEtablissement;
	}

	public String getNumEtablissement() {
		return numEtablissement;
	}

	public void setNumEtablissement(String numEtablissement) {
		this.numEtablissement = numEtablissement;
	}

	@Override
	public String toString() {
		return "Etablissement [numEtablissement=" + numEtablissement + "]";
	}
	

}
