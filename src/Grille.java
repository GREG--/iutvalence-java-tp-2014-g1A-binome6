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
	public int placerPion(int colonnePion, Etat joueurCourant) {
		if (colonnePion > Grille.NOMBRE_DE_LIGNES || colonnePion < 0) {
			System.err.println("Erreur de saisie");
			/* XXX INDIQUER LE PROBLEME */
			return colonnePion;
		}

		int i = NOMBRE_DE_LIGNES - 1;
		/* TODO À implémenter au plus vite !!!! */
		do {
			if (cases[i][colonnePion] == Etat.VIDE) {
				cases[i][colonnePion] = joueurCourant;
				int numLigne = i;
				return numLigne;
			}
			i--;
		} while (i >= 0);
		return -100;
		/* XXX INDIQUER LE PROBLEME */
	}

	/**
	 * Obtenir une représentation en ASCII de la grille.
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

	/* méthode de vérification à complétée */
	public boolean verifVictoire(int lignePion, int colonnePion, Etat joueurCourant) {
		int compteur = 0;
		for (int i = 0; i < NOMBRE_DE_COLONNES; i++) {
			if (cases[lignePion][i] == joueurCourant) {
				compteur++;
			}
			else {
				compteur = 0;
			}
			if (compteur == 4) {
				return true;
			}
		}
		
		compteur = 0;
		for (int i = 0; i < NOMBRE_DE_LIGNES; i++) {
			if (cases[i][colonnePion] == joueurCourant) {
				compteur++;
			}
			else {
				compteur = 0;
			}
			if (compteur == 4) {
				return true;
			}
		}
		
		compteur = 0;
		for (int i = 0; i < NOMBRE_DE_LIGNES; i++) {
			for (int j = 0; j < NOMBRE_DE_COLONNES; j++){
				if (cases[i][j] == joueurCourant) {
					compteur++;
				}
				else {
					compteur = 0;
				}
				if (compteur == 4) {
					return true;
				}
			}
		}

		return false;
	}
}