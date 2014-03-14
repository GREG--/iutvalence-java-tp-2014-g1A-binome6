/* TODO Package. */
/* TODO Javadoc. */
/* TODO J'ai corrigé l'indentation. Faites-le ! */
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
        this.cases = new Etat[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];

        for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++) {
            for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++) {
                this.cases[numeroDeLigne][numeroDeColonne] = Etat.VIDE;
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
                if (this.cases[numeroDeLigne][numeroDeColonne] == Etat.VIDE) {
                    grillealpha += "O ";
                }
                else { grillealpha += "R "; }
            }
            grillealpha += "\n";
        }

        return grillealpha;
    }
}
