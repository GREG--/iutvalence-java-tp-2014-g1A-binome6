/* TODO Package. */

/**
 * TODO.
 * 
 * @author Blanc-Partula
 * @version TODO
 */
public class Grille {
	/** Le nombre de cases par ligne. */
	private static final int NOMBRE_DE_LIGNES = 6;
	/** Le nombre de cases par colonne. */
	private static final int NOMBRE_DE_COLONNES = 7;

	/* TODO Change en cours de partie ? */
	/** Les cases de la grille. */
	private Etat[][] cases;

	/** Construire une nouvelle grille vide. */
	public Grille() {
		this.cases = new Etat[Grille.NOMBRE_DE_LIGNES][Grille.NOMBRE_DE_COLONNES];

		for (int numeroDeLigne = 0; numeroDeLigne < Grille.NOMBRE_DE_LIGNES; numeroDeLigne++) {
			for (int numeroDeColonne = 0; numeroDeColonne < Grille.NOMBRE_DE_COLONNES; numeroDeColonne++) {
				this.cases[numeroDeLigne][numeroDeColonne] = Etat.VIDE;
			}
		}
	}

	/** TODO. */
	public void placerPion(int colonnePion, Etat joueurCourant) {
		if (colonnePion > Grille.NOMBRE_DE_LIGNES || colonnePion < 0) {
			System.err.println("Erreur de saisie");
			/* XXX INDIQUER LE PROBLEME */
			return;
		}

		int i = NOMBRE_DE_LIGNES - 1;
		/* TODO À implémenter au plus vite !!!! */
		do {
			if (cases[i][colonnePion] == Etat.VIDE) {
				cases[i][colonnePion] = joueurCourant;
				return;
			}
			i--;
		} while (i >= 0);

		/* XXX INDIQUER LE PROBLEME */
	}

	/**
	 * Obtenir une représentation en ASCII-art de la grille.
	 * <p/>
	 * Les cases sont représentées par des O.
	 */
	public String toString() {
		String grillealpha = "";

		for (int numeroDeLigne = 0; numeroDeLigne < Grille.NOMBRE_DE_LIGNES; numeroDeLigne++) {
			grillealpha += '|';
			for (int numeroDeColonne = 0; numeroDeColonne < Grille.NOMBRE_DE_COLONNES; numeroDeColonne++) {
				grillealpha += this.cases[numeroDeLigne][numeroDeColonne]
						.toString();
				grillealpha += '|';
			}
			grillealpha += "\n";
		}
		grillealpha += " \n 0 1 2 3 4 5 6";
		return grillealpha;
	}

	/*public void verifVictoire() {
		if (cases[i][])	
	}*/
}