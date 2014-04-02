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
	public void placerPion(int colonnePion) {
		/* TODO Incohérent ! */
		if (colonnePion > Grille.NOMBRE_DE_LIGNES) {
			System.err
					.println("Impossible de placer le pion, la colonne est pleine");
		} else {
			int i = 0;
			/* TODO À implémenter au plus vite !!!! */
			while (cases[i][colonnePion] = Etat.VIDE) {
				if (cases[i][colonnePion] = Etat.VIDE) {
					cases[i][colonnePion] = this.joueurCourant;
				} else {
					i++;
				}
			}
		}
	}

	/* TODO Peut-être simplifié par un usage pertinent des "enum" */
	/* TODO Mauvais comportement. Vous ne distinguez pas les joueurs. */
	/**
	 * Obtenir une représentation en ASCII-art de la grille.
	 * <p/>
	 * Les cases sont représentées par des O.
	 */
	public String toString() {
		String grillealpha = "";

		for (int numeroDeLigne = 0; numeroDeLigne < Grille.NOMBRE_DE_LIGNES; numeroDeLigne++) {
			for (int numeroDeColonne = 0; numeroDeColonne < Grille.NOMBRE_DE_COLONNES; numeroDeColonne++) {
				if (this.cases[numeroDeLigne][numeroDeColonne] == Etat.VIDE) {
					grillealpha += "O ";
				} else {
					grillealpha += "R ";
				}
			}
			grillealpha += "\n";
		}
		return grillealpha;
	}
}