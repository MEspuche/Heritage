package metier;

public class CompteEpargne extends Compte {

	private float taux;

	public CompteEpargne(float taux) {
		super();
		this.taux = taux;
	}

	public CompteEpargne(int id, String nom, float solde, float taux) {
		super(id, nom, solde);
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteEpargne [" + super.toString() +  " Taux =" + taux + "]";
	}

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}
	
	/**
	 * Methode calcul des taux d'intérêt
	 * @param taux taux du compte
	 * @return retourne le solde du compte
	 */
	public float calculInteret (){
		this.solde=(this.solde*(1+taux));
		return this.solde;
	}
	
	
}
