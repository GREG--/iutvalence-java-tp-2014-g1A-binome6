/* TODO Package. */
import java.util.Scanner;

/**
 * TODO.
 * 
 * @author Blanc-Partula
 * @version TODO
 */
public class Puissance4 {
	/** TODO. */

	public static Etat joueurCourant;
	/* TODO Change en cours de partie ? */
	/** TODO. */
	public Grille grille;

	public Puissance4() {
		Puissance4.joueurCourant = Etat.JOUEUR_1;
		this.grille = new Grille();
	}

	public void jouer() {
		int i = 0;
		while (i <= 0) {

			System.out.println("Veuillez saisir le numéro de colonne");
			Scanner sc = new Scanner(System.in);
			int numScan = sc.nextInt();
			int numLigne = grille.placerPion(numScan, joueurCourant);
			System.out.println(grille);
			boolean victoire = grille.verifVictoire(numLigne, numScan, joueurCourant);
			System.out.println(victoire);
			if (joueurCourant == Etat.JOUEUR_1) {
				joueurCourant = Etat.JOUEUR_2;
			} else {
				joueurCourant = Etat.JOUEUR_1;
			}
			i = i - 1;
			if (victoire==true){
				break;
			}
			/* Saisir */
			/* Tenter de poser. */
			/* Victoire. */
			/* Saisir mettre dans application */
			/* Tenter de poser. */
			/* Victoire ? */
		}
		System.out.println("Bravo tu as gagné");
	}

	public static Etat getJoueurCourant() {
		return joueurCourant;
	}

	public static void setJoueurCourant(Etat joueurCourant) {
		Puissance4.joueurCourant = joueurCourant;
	}
	
}