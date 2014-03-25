/* TODO Package. */
/* TODO Javadoc. */
/**
 * @Author : Blanc-Partula
 */
public class Case {
	/** Le nombre de cases par ligne. */
	private static final int NOMBRE_DE_LIGNES = 6;

	/** Le nombre de cases par colonne. */
	private static final int NOMBRE_DE_COLONNES = 7;

	/* TODO Change en cours de partie ? */
	/** Les cases de la grille. */
	private Etat[][] cases;

	/** Construire une nouvelle grille vide. */
	
	public Case() {
		this.cases = new Etat[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++) {
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++) {
				this.cases[numeroDeLigne][numeroDeColonne] = Etat.VIDE;
			}
		}
	}

	public void placerPion(int numColonne) {
		if (numColonne > NOMBRE_DE_COLONNES) {
			System.err.println("Impossible de placer le pion, la position n'est pas valide");
		}
		else 
		{
			int numLigne = 0;
			while (cases[numLigne][numColonne] != Etat.VIDE){
					numLigne++;
					if (numLigne>NOMBRE_DE_LIGNES)
					{
						System.err.println("La colonne est pleine, veuillez choisir une autre colonne");
					}
					else
					{
						cases[numLigne][numColonne]=joueurCourant;
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

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++) {
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++) {
				if (this.cases[numeroDeLigne][numeroDeColonne] == Etat.VIDE) 
				{
					grillealpha += "_ ";
				} 
				
				else 
				{
					grillealpha += "R ";
				}
				
				if (this.cases[numeroDeLigne][numeroDeColonne] == Etat.JOUEUR_1) 
				{
					grillealpha += "X ";
				}
				
				if(this.cases[numeroDeLigne][numeroDeColonne]== Etat.JOUEUR_2)
				{
					grillealpha += "O ";
				}
			}
			grillealpha += "\n";
		}

		return grillealpha;
	}
//	Case.placerPion(); 
}
