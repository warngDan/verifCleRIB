package verifCleRIB;

public class Compte {
	
	
	String numero;

	
	
	public Compte() {}

	public Compte(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + "]";
	}
}
