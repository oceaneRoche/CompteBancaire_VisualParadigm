import java.util.Vector;

public class Compte {
	private int _numero;
	//private devise _devise;
	private float _solde;
	public Client _proprietaire;
	public Vector<Banquier> _gerants = new Vector<Banquier>();

	public void Deposer(float aMontant) {
		throw new UnsupportedOperationException();
	}

	public void Retirer(float aMontant) {
		throw new UnsupportedOperationException();
	}

	public float Solde() {
		throw new UnsupportedOperationException();
	}
}